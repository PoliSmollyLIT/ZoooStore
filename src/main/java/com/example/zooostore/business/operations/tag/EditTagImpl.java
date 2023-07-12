package com.example.zooostore.business.operations.tag;

import com.example.zooostore.api.operations.tag.edit.EditTagOperation;
import com.example.zooostore.api.operations.tag.edit.EditTagRequest;
import com.example.zooostore.api.operations.tag.edit.EditTagResponse;
import com.example.zooostore.data.models.Tag;
import com.example.zooostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditTagImpl implements EditTagOperation {
    private final TagRepository tagRepository;
    @Override
    public EditTagResponse editTag(EditTagRequest tag) {
        Tag tagEntity = tagRepository.findTagById(tag.getId());
        tagEntity.setTitle(tag.getTitle());
        tagRepository.save(tagEntity);
        EditTagResponse tagResponse = EditTagResponse.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .build();
        return tagResponse;
    }
}

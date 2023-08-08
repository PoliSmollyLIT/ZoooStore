package com.example.zooostore.core.operations.tag;

import com.example.zooostore.api.operations.tag.edit.EditTagOperation;
import com.example.zooostore.api.operations.tag.edit.EditTagRequest;
import com.example.zooostore.api.operations.tag.edit.EditTagResponse;
import com.example.zooostore.persistance.models.Tag;
import com.example.zooostore.persistance.repositories.TagRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditTagCore implements EditTagOperation {
    private final TagRepository tagRepository;
    @Override
    public EditTagResponse process(EditTagRequest tag) {
        Tag tagEntity = tagRepository.findTagById(tag.getId()).orElseThrow(()-> new EntityNotFoundException("Tag with this id does not exist"));
        tagEntity.setTitle(tag.getTitle());
        tagRepository.save(tagEntity);
        EditTagResponse tagResponse = EditTagResponse.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .build();
        return tagResponse;
    }
}

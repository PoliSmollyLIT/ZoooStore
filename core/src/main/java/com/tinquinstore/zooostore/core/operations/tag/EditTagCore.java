package com.tinquinstore.zooostore.core.operations.tag;

import com.tinquinstore.zooostore.api.operations.tag.edit.EditTagOperation;
import com.tinquinstore.zooostore.api.operations.tag.edit.EditTagRequest;
import com.tinquinstore.zooostore.api.operations.tag.edit.EditTagResponse;
import com.tinquinstore.zooostore.persistance.models.Tag;
import com.tinquinstore.zooostore.persistance.repositories.TagRepository;
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

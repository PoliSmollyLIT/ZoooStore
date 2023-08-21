package com.tinquinstore.zooostore.core.operations.tag;

import com.tinquinstore.zooostore.api.operations.tag.create.CreateTagOperation;
import com.tinquinstore.zooostore.api.operations.tag.create.CreateTagRequest;
import com.tinquinstore.zooostore.api.operations.tag.create.CreateTagResponse;
import com.tinquinstore.zooostore.persistance.models.Tag;
import com.tinquinstore.zooostore.persistance.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTagCore implements CreateTagOperation {
    private final TagRepository tagRepository;
    @Override
    public CreateTagResponse process(CreateTagRequest tag) {
        Tag tagEntity = Tag.builder()
                .title(tag.getTitle())
                .build();
        tagRepository.save(tagEntity);
        CreateTagResponse tagResponse = CreateTagResponse.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .build();
        return tagResponse;
    }
}

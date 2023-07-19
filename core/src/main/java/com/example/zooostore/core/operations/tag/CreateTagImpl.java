package com.example.zooostore.core.operations.tag;

import com.example.zooostore.api.operations.tag.create.CreateTagOperation;
import com.example.zooostore.api.operations.tag.create.CreateTagRequest;
import com.example.zooostore.api.operations.tag.create.CreateTagResponse;
import com.example.zooostore.persistance.models.Tag;
import com.example.zooostore.persistance.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTagImpl implements CreateTagOperation {
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

package com.example.zooostore.business.operations.tag;

import com.example.zooostore.api.operations.tag.create.CreateTagOperation;
import com.example.zooostore.api.operations.tag.create.CreateTagRequest;
import com.example.zooostore.api.operations.tag.create.CreateTagResponse;
import com.example.zooostore.data.models.Tag;
import com.example.zooostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTagImpl implements CreateTagOperation {
    private final TagRepository tagRepository;
    @Override
    public CreateTagResponse createTag(CreateTagRequest tag) {
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

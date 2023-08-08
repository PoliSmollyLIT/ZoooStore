package com.example.zooostore.core.operations.tag;

import com.example.zooostore.api.operations.tag.delete.DeleteTagOperation;
import com.example.zooostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zooostore.api.operations.tag.delete.DeleteTagResponse;
import com.example.zooostore.persistance.models.Tag;
import com.example.zooostore.persistance.repositories.TagRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTagCore implements DeleteTagOperation {
    private final TagRepository tagRepository;
    @Override
    public DeleteTagResponse process(DeleteTagRequest deleteTagRequest) {
        Tag tagEntity = tagRepository.findTagById(deleteTagRequest.getId()).orElseThrow(()-> new EntityNotFoundException("Tag with this id does not exist"));
            tagRepository.delete(tagEntity);
            DeleteTagResponse deleteTagResponse = DeleteTagResponse.builder()
                    .id(tagEntity.getId())
                    .build();
            return deleteTagResponse;

    }
}

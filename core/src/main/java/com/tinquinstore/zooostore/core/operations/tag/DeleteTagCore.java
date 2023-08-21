package com.tinquinstore.zooostore.core.operations.tag;

import com.tinquinstore.zooostore.api.operations.tag.delete.DeleteTagOperation;
import com.tinquinstore.zooostore.api.operations.tag.delete.DeleteTagRequest;
import com.tinquinstore.zooostore.api.operations.tag.delete.DeleteTagResponse;
import com.tinquinstore.zooostore.persistance.models.Tag;
import com.tinquinstore.zooostore.persistance.repositories.TagRepository;
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

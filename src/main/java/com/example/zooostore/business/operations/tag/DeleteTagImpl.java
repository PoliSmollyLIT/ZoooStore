package com.example.zooostore.business.operations.tag;

import com.example.zooostore.api.operations.tag.delete.DeleteTagOperation;
import com.example.zooostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zooostore.data.models.Tag;
import com.example.zooostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeleteTagImpl implements DeleteTagOperation {
    private final TagRepository tagRepository;
    @Override
    public HttpStatus deleteTag(DeleteTagRequest deleteTagRequest) {
        Tag tagEntity = tagRepository.findTagById(deleteTagRequest.getId());
        try{
            tagRepository.delete(tagEntity);
            return HttpStatus.OK;
        }catch(Exception ex){
            return HttpStatus.BAD_REQUEST;
        }
    }
}

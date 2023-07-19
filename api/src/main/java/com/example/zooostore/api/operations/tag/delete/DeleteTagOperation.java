package com.example.zooostore.api.operations.tag.delete;

import com.example.zooostore.api.operations.base.OperationProcessor;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public interface DeleteTagOperation extends OperationProcessor<DeleteTagResponse, DeleteTagRequest> {
    DeleteTagResponse process(DeleteTagRequest id);
}

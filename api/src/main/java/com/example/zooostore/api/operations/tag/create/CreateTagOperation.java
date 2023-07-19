package com.example.zooostore.api.operations.tag.create;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface CreateTagOperation extends OperationProcessor<CreateTagResponse, CreateTagRequest> {
    CreateTagResponse process(CreateTagRequest tag);
}

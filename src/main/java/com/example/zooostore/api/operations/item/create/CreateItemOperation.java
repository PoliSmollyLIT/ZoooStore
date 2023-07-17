package com.example.zooostore.api.operations.item.create;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface CreateItemOperation extends OperationProcessor<CreateItemResponse, CreateItemRequest> {
    CreateItemResponse process(CreateItemRequest itemInput);
}

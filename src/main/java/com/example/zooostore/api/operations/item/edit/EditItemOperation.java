package com.example.zooostore.api.operations.item.edit;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface EditItemOperation extends OperationProcessor<EditItemResponse, EditItemRequest> {
    EditItemResponse process(EditItemRequest item);
}

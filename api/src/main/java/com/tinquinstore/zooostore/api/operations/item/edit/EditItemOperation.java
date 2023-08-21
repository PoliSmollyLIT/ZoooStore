package com.tinquinstore.zooostore.api.operations.item.edit;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface EditItemOperation extends OperationProcessor<EditItemResponse, EditItemRequest> {
    EditItemResponse process(EditItemRequest item);
}

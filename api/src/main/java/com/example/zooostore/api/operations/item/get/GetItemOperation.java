package com.example.zooostore.api.operations.item.get;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface GetItemOperation extends OperationProcessor<GetItemResponse, GetItemRequest> {
    GetItemResponse process(GetItemRequest getItemRequest);
}

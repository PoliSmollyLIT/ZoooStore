package com.example.zooostore.api.operations.item.getall;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface GetAllItemsOperation extends OperationProcessor<GetAllItemsResponse, GetAllItemsRequest> {
    GetAllItemsResponse process(GetAllItemsRequest request);
}

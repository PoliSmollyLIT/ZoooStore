package com.tinquinstore.zooostore.api.operations.item.getall;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface GetAllItemsOperation extends OperationProcessor<GetAllItemsResponse, GetAllItemsRequest> {
    GetAllItemsResponse process(GetAllItemsRequest request);
}

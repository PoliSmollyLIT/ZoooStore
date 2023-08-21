package com.tinquinstore.zooostore.api.operations.item.get;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface GetItemOperation extends OperationProcessor<GetItemResponse, GetItemRequest> {
    GetItemResponse process(GetItemRequest getItemRequest);
}

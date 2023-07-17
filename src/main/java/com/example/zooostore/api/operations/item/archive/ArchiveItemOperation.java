package com.example.zooostore.api.operations.item.archive;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface ArchiveItemOperation extends OperationProcessor<ArchiveItemResponse, ArchiveItemRequest> {
    ArchiveItemResponse process(ArchiveItemRequest id);
}

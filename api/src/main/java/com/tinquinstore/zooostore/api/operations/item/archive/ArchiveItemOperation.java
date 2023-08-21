package com.tinquinstore.zooostore.api.operations.item.archive;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface ArchiveItemOperation extends OperationProcessor<ArchiveItemResponse, ArchiveItemRequest> {
    ArchiveItemResponse process(ArchiveItemRequest id);
}

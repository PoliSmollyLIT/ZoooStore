package com.example.zooostore.api.operations.item.archive;

import java.util.UUID;

public interface ArchiveItemOperation {
    ArchiveItemResponse archiveItem(UUID id);
}

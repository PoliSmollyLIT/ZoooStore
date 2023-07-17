package com.example.zooostore.api.operations.item.archive;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveItemResponse implements OperationResult {
    private UUID id;
}

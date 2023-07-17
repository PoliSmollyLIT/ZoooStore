package com.example.zooostore.api.operations.item.archive;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveItemRequest implements OperationInput {
    private UUID id;
}

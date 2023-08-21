package com.tinquinstore.zooostore.api.operations.item.archive;

import com.tinquinstore.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveItemResponse implements OperationResult {
    @NotBlank
    private UUID id;
}

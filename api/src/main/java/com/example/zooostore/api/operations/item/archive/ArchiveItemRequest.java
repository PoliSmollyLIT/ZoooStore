package com.example.zooostore.api.operations.item.archive;

import com.example.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveItemRequest implements OperationInput {
    @NotBlank
    private UUID id;
}

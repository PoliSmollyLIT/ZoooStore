package com.tinquinstore.zooostore.api.operations.item.getall;

import com.tinquinstore.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetSingleItemResponse implements OperationResult {
    @NotBlank
    private UUID id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private UUID vendorId;
    private Set<UUID> multimediaIds;
    private Set<Long> tagIds;
    @NotBlank
    private boolean archive;
}


package com.example.zooostore.api.operations.item.edit;

import com.example.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemResponse implements OperationResult {
    @NotBlank
    private UUID id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private EditItemVendorOutput vendor;
    private Set<EditItemMultimediaOutput> multimedia;
    private Set<EditItemTagOutput> tags;
    @NotBlank
    private boolean archive;
}

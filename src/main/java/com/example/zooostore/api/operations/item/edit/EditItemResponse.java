package com.example.zooostore.api.operations.item.edit;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemResponse implements OperationResult {
    private UUID id;
    private String title;
    private String description;
    private EditItemVendorOutput vendor;
    private Set<EditItemMultimediaOutput> multimedia;
    private Set<EditItemTagOutput> tags;
    private boolean archive;
}

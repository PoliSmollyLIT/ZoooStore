package com.example.zooostore.api.operations.item.edit;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemResponse {
    private UUID id;
    private String title;
    private String description;
    private EditItemVendorOutput vendor;
    private Set<EditItemMultimediaOutput> multimedia;
    private Set<EditItemTagOutput> tags;
    private boolean archive;
}

package com.example.zooostore.api.operations.item.archive;

import com.example.zooostore.api.dto.MultimediaInput;
import com.example.zooostore.api.dto.TagInput;
import com.example.zooostore.api.dto.VendorInput;
import lombok.*;

import java.util.Set;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveItemRequest {
    private String title;
    private String description;
    private VendorInput vendor;
    private Set<MultimediaInput> multimedia;
    private Set<TagInput> tags;
    private boolean archive;
}

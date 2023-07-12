package com.example.zooostore.api.operations.item.edit;

import com.example.zooostore.api.dto.MultimediaOutput;
import com.example.zooostore.api.dto.TagOutput;
import com.example.zooostore.api.dto.VendorOutput;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemRequest {
    private String title;
    private String description;
    private UUID vendor;
}

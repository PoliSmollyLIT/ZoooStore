package com.example.zooostore.api.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter(AccessLevel.PRIVATE)
public class ItemOutput {
    private UUID id;
    private String title;
    private String description;
    private VendorInput vendor;
    private Set<MultimediaInput> multimedia;
    private Set<TagInput> tags;
    private boolean archive;
}

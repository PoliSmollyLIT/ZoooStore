package com.example.zooostore.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter(AccessLevel.PRIVATE)
public class ItemInput {
    private String title;
    private String description;
    private VendorInput vendor;
    private Set<MultimediaInput> multimedia;
    private Set<TagInput> tags;
    private boolean archive;
}

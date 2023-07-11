package com.example.zooostore.api.dto;

import com.example.zooostore.data.models.Item;

import java.util.Set;
import java.util.UUID;

public class VendorOutput {
    private UUID id;
    private String name;
    private String phone;
    private Set<Item> items;

}

package com.example.zooostore.api.dto;

import com.example.zooostore.data.models.Item;

import java.util.Set;

public class TagOutput {
    private Long id;
    private String title;
    private Set<Item> items;
}

package com.example.zooostore.services;

import com.example.zooostore.dto.ItemInput;
import com.example.zooostore.dto.ItemOutput;

import java.util.UUID;


public interface ItemsService {
    ItemOutput createItem(ItemInput itemInput);
    ItemOutput archiveItem(UUID id);
    ItemOutput editItem(ItemOutput item);
}

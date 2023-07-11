package com.example.zooostore.business.operations;

import com.example.zooostore.api.dto.ItemInput;
import com.example.zooostore.api.dto.ItemOutput;

import java.util.UUID;


public interface ItemsService {
    ItemOutput createItem(ItemInput itemInput);
    ItemOutput archiveItem(UUID id);
    ItemOutput editItem(ItemOutput item);
}

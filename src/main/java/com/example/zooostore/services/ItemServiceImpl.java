package com.example.zooostore.services;

import com.example.zooostore.dto.ItemInput;
import com.example.zooostore.dto.ItemOutput;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemsService{
    @Override
    public ItemOutput createItem(ItemInput itemInput) {
        return null;
    }

    @Override
    public ItemOutput archiveItem(UUID id) {
        return null;
    }

    @Override
    public ItemOutput editItem(ItemOutput item) {
        return null;
    }
}

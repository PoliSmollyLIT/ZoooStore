package com.example.zooostore.business.operations.item;

import com.example.zooostore.api.dto.ItemInput;
import com.example.zooostore.api.dto.ItemOutput;
import com.example.zooostore.business.operations.ItemsService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemsService {
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

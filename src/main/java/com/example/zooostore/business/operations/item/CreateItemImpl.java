package com.example.zooostore.business.operations.item;

import com.example.zooostore.api.operations.item.create.CreateItemOperation;
import com.example.zooostore.api.operations.item.create.CreateItemRequest;
import com.example.zooostore.api.operations.item.create.CreateItemResponse;
import com.example.zooostore.data.models.Item;
import com.example.zooostore.data.repositories.ItemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateItemImpl implements CreateItemOperation {
    private final ItemRepo itemRepo;

    @Override
    public CreateItemResponse createItem(CreateItemRequest itemInput) {
        Item item = Item.builder()
                .title(itemInput.getTitle())
                .description(itemInput.getDescription())
                .archived(itemInput.isArchive())
                .build();
        itemRepo.save(item);
        CreateItemResponse response = CreateItemResponse.builder()
                .id(item.getId())
                .description(item.getDescription())
                .title(item.getTitle())
                .archive(item.isArchived())
                .build();
        return response;
    }
}

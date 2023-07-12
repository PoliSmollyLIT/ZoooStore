package com.example.zooostore.business.operations.item;

import com.example.zooostore.api.operations.item.archive.ArchiveItemOperation;
import com.example.zooostore.api.operations.item.archive.ArchiveItemResponse;
import com.example.zooostore.api.operations.item.create.CreateItemResponse;
import com.example.zooostore.data.models.Item;
import com.example.zooostore.data.repositories.ItemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ArchiveItemImpl implements ArchiveItemOperation {
    private final ItemRepo itemRepo;
    @Override
    public ArchiveItemResponse archiveItem(UUID id) {
        Item item = Item.builder()
                .id(id)
                .archived(true)
                .build();
        itemRepo.save(item);
        ArchiveItemResponse response = ArchiveItemResponse.builder()
                .id(item.getId())
                .description(item.getDescription())
                .title(item.getTitle())
                .archive(item.isArchived())
                .build();
        return response;
    }
}

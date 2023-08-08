package com.example.zooostore.core.operations.item;

import com.example.zooostore.api.operations.item.archive.ArchiveItemOperation;
import com.example.zooostore.api.operations.item.archive.ArchiveItemRequest;
import com.example.zooostore.api.operations.item.archive.ArchiveItemResponse;
import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.repositories.ItemRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArchiveItemCore implements ArchiveItemOperation {
    private final ItemRepository itemRepository;
    @Override
    public ArchiveItemResponse process(ArchiveItemRequest archiveItemRequest) {
        Item item = itemRepository.findItemById(archiveItemRequest.getId())
                .orElseThrow(()->new EntityNotFoundException("Item with this id does not exist"));
        item.setArchived(true);
        itemRepository.save(item);
        ArchiveItemResponse response = ArchiveItemResponse.builder()
                .id(item.getId())
                .build();
        return response;
    }
}

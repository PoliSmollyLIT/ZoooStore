package com.example.zooostore.business.operations.item;

import com.example.zooostore.api.operations.item.archive.ArchiveItemOperation;
import com.example.zooostore.api.operations.item.archive.ArchiveItemRequest;
import com.example.zooostore.api.operations.item.archive.ArchiveItemResponse;
import com.example.zooostore.data.models.Item;
import com.example.zooostore.data.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArchiveItemImpl implements ArchiveItemOperation {
    private final ItemRepository itemRepository;
    @Override
    public ArchiveItemResponse archiveItem(ArchiveItemRequest archiveItemRequest) {
        Item item = itemRepository.findItemById(archiveItemRequest.getId());
        item.setArchived(true);
        itemRepository.save(item);
        ArchiveItemResponse response = ArchiveItemResponse.builder()
                .id(item.getId())
                .build();
        return response;
    }
}

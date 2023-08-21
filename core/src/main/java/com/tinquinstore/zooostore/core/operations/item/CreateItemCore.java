package com.tinquinstore.zooostore.core.operations.item;

import com.tinquinstore.zooostore.api.operations.item.create.CreateItemOperation;
import com.tinquinstore.zooostore.api.operations.item.create.CreateItemRequest;
import com.tinquinstore.zooostore.api.operations.item.create.CreateItemResponse;
import com.tinquinstore.zooostore.persistance.models.Item;
import com.tinquinstore.zooostore.persistance.models.Tag;
import com.tinquinstore.zooostore.persistance.models.Vendor;
import com.tinquinstore.zooostore.persistance.repositories.ItemRepository;
import com.tinquinstore.zooostore.persistance.repositories.TagRepository;
import com.tinquinstore.zooostore.persistance.repositories.VendorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CreateItemCore implements CreateItemOperation {
    private final ItemRepository itemRepository;
    private final VendorRepository vendorRepository;
    private final TagRepository tagRepository;

    @Override
    public CreateItemResponse process(CreateItemRequest itemInput) {
        Vendor vendor = vendorRepository.findVendorById(itemInput.getVendor()).orElseThrow(()-> new EntityNotFoundException("Vendor with this id does not exist"));
        Set<Tag> tags = tagRepository.findTagByIdIn(itemInput.getTags());
        Item item = Item.builder()
                .title(itemInput.getTitle())
                .description(itemInput.getDescription())
                .vendor(vendor)
                .tags(tags)
                .archived(itemInput.isArchive())
                .build();
        itemRepository.save(item);
        CreateItemResponse response = CreateItemResponse.builder()
                .id(item.getId())
                .description(item.getDescription())
                .title(item.getTitle())
                .vendor(item.getVendor().getId())
                .tags(item.getTags().stream().map(Tag::getId).collect(Collectors.toSet()))
                .archive(item.isArchived())
                .build();
        return response;
    }
}

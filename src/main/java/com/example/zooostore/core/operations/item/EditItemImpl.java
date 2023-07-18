package com.example.zooostore.core.operations.item;

import com.example.zooostore.api.operations.item.edit.*;
import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.models.Multimedia;
import com.example.zooostore.persistance.models.Tag;
import com.example.zooostore.persistance.models.Vendor;
import com.example.zooostore.persistance.repositories.ItemRepository;
import com.example.zooostore.persistance.repositories.VendorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EditItemImpl implements EditItemOperation {
    private final ItemRepository itemRepository;
    private final VendorRepository vendorRepository;
    @Override
    public EditItemResponse process(EditItemRequest itemInput) {
        Vendor vendor = vendorRepository.findVendorById(itemInput.getVendor()).orElseThrow(()-> new EntityNotFoundException("Vendor with this id does not exist"));
        Item item = itemRepository.findItemById(itemInput.getId()).orElseThrow(()-> new EntityNotFoundException("Item with this id does not exist"));
        item.setTitle(itemInput.getTitle());
        item.setDescription(itemInput.getDescription());
        item.setVendor(vendor);
        itemRepository.save(item);
        Set<EditItemMultimediaOutput> multimediaOutputSet = new HashSet<>();
        for (Multimedia multi:item.getMultimedia()) {
            multimediaOutputSet.add(
                    EditItemMultimediaOutput.builder()
                            .url(multi.getUrl())
                            .id(multi.getId())
                            .build()
            );
        }
        EditItemVendorOutput vendorOutput = EditItemVendorOutput.builder()
                .id(item.getVendor().getId())
                .name(item.getVendor().getName())
                .phone(item.getVendor().getPhone())
                .build();

        Set<EditItemTagOutput> tags = new HashSet<>();
        for (Tag tag:item.getTags() ) {
            tags.add(EditItemTagOutput.builder()
                    .id(tag.getId())
                    .title(tag.getTitle())
                    .build()
            );
        }
        EditItemResponse response = EditItemResponse.builder()
                .id(item.getId())
                .description(item.getDescription())
                .title(item.getTitle())
                .archive(item.isArchived())
                .multimedia(multimediaOutputSet)
                .vendor(vendorOutput)
                .tags(tags)
                .build();
        return response;
    }

}

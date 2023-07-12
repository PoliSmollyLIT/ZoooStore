package com.example.zooostore.business.operations.item;

import com.example.zooostore.api.operations.item.create.CreateItemResponse;
import com.example.zooostore.api.operations.item.edit.*;
import com.example.zooostore.data.models.Item;
import com.example.zooostore.data.models.Multimedia;
import com.example.zooostore.data.models.Tag;
import com.example.zooostore.data.models.Vendor;

import com.example.zooostore.data.repositories.ItemRepo;
import com.example.zooostore.data.repositories.VendorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EditItemImpl implements EditItemOperation {
    private final ItemRepo itemRepo;
    private final VendorRepo vendorRepo;
    @Override
    public EditItemResponse editItem(EditItemRequest itemInput) {
        Vendor vendor = vendorRepo.findVendorById(itemInput.getVendor());
        Item item = Item.builder()
                .title(itemInput.getTitle())
                .description(itemInput.getDescription())
                .vendor(vendor)
                .build();
        itemRepo.save(item);
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

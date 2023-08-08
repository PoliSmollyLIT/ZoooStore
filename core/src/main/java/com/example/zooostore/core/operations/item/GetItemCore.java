package com.example.zooostore.core.operations.item;

import com.example.zooostore.api.operations.item.edit.EditItemMultimediaOutput;
import com.example.zooostore.api.operations.item.edit.EditItemTagOutput;
import com.example.zooostore.api.operations.item.edit.EditItemVendorOutput;
import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.api.operations.item.get.GetItemOperation;
import com.example.zooostore.api.operations.item.get.GetItemRequest;
import com.example.zooostore.api.operations.item.get.GetItemResponse;
import com.example.zooostore.persistance.models.Multimedia;
import com.example.zooostore.persistance.models.Tag;
import com.example.zooostore.persistance.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class GetItemCore implements GetItemOperation {
    private final ItemRepository itemRepository;
    @Override
    public GetItemResponse process(GetItemRequest getItemRequest) {
        Item item = itemRepository.getReferenceById(getItemRequest.getId());
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
        GetItemResponse response = GetItemResponse.builder()
                .id(item.getId())
                .title(item.getTitle())
                .description(item.getDescription())
                .vendor(vendorOutput)
                .multimedia(multimediaOutputSet)
                .tags(tags)
                .archive(item.isArchived())
                .build();
        return response;
    }
}

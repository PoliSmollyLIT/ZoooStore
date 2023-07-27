package com.example.zooostore.core.operations.item;

import com.example.zooostore.api.operations.item.edit.EditItemVendorOutput;
import com.example.zooostore.api.operations.item.getall.GetAllItemsOperation;
import com.example.zooostore.api.operations.item.getall.GetAllItemsRequest;
import com.example.zooostore.api.operations.item.getall.GetAllItemsResponse;
import com.example.zooostore.api.operations.item.getall.GetSingleItemResponse;
import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.models.Multimedia;
import com.example.zooostore.persistance.models.Tag;
import com.example.zooostore.persistance.repositories.ItemRepository;
import com.example.zooostore.persistance.repositories.TagRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.metrics.StartupStep;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetAllItemsImpl implements GetAllItemsOperation {
    private final ItemRepository itemRepository;
    private final TagRepository tagRepository;

    @Override
    public GetAllItemsResponse process(GetAllItemsRequest request) {
        Tag tagToFilterBy = tagRepository.findByTitle(request.getTagTitle())
                .orElseThrow(EntityNotFoundException::new);

        List<GetSingleItemResponse> result = itemRepository.findAll().stream()
                .filter(item -> item.getTags().contains(tagToFilterBy))
                .map(item -> GetSingleItemResponse.builder()
                        .id(item.getId())
                        .title(item.getTitle())
                        .description(item.getDescription())
                        .vendorId(item.getVendor().getId())
                        .multimediaIds(item.getMultimedia()
                                .stream()
                                .map(Multimedia::getId)
                                .collect(Collectors.toSet()))
                        .tagIds(item.getTags()
                                .stream()
                                .map(Tag::getId)
                                .collect(Collectors.toSet()))
                        .archive(item.isArchived())
                        .build())
                .collect(Collectors.toList());

        return GetAllItemsResponse.builder().items(result).build();
    }
    }

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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.metrics.StartupStep;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    @Value("${pagination}")
    private Integer pagination;

    @Override
    public GetAllItemsResponse process(GetAllItemsRequest request) {
        Tag tagToFilterBy = tagRepository.findByTitle(request.getTagTitle())
                .orElseThrow(EntityNotFoundException::new);
        Pageable pageable = PageRequest.of(request.getPage(), pagination);

        Page<Item> items = itemRepository.findAllByTags_Id(tagToFilterBy.getId(), pageable);

        List<GetSingleItemResponse> itemsFromPage = items.getContent().stream()
                .map(item -> GetSingleItemResponse.builder()
                        .id(item.getId())
                        .title(item.getTitle())
                        .description(item.getDescription())
                        .archive(item.isArchived())
                        .vendorId(item.getVendor().getId())
                .build()).toList();
        return GetAllItemsResponse.builder().items(itemsFromPage).build();
    }
    }

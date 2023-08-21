package com.tinquinstore.zooostore.rest.controllers;

import com.tinquinstore.zooostore.api.operations.item.archive.ArchiveItemOperation;
import com.tinquinstore.zooostore.api.operations.item.archive.ArchiveItemRequest;
import com.tinquinstore.zooostore.api.operations.item.create.CreateItemOperation;
import com.tinquinstore.zooostore.api.operations.item.create.CreateItemRequest;
import com.tinquinstore.zooostore.api.operations.item.edit.EditItemOperation;
import com.tinquinstore.zooostore.api.operations.item.edit.EditItemRequest;
import com.tinquinstore.zooostore.api.operations.item.get.GetItemOperation;
import com.tinquinstore.zooostore.api.operations.item.get.GetItemRequest;
import com.tinquinstore.zooostore.api.operations.item.getall.GetAllItemsOperation;
import com.tinquinstore.zooostore.api.operations.item.getall.GetAllItemsRequest;
import com.tinquinstore.zooostore.api.operations.item.getall.GetAllItemsResponse;
import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleOperation;
import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleRequest;
import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/zoostore/item")
@Tag(name = "Zoostsore", description = "API for working with items")
@RequiredArgsConstructor
@Validated
public class ItemController {
    private final ArchiveItemOperation archiveItem;
    private final CreateItemOperation createItem;
    private final EditItemOperation editItem;
    private final GetItemOperation getItem;
    private final GetAllItemsOperation getAllItems;
    private final SearchByTitleOperation searchByTitle;

    @PostMapping()
    @Operation(summary = "Create Item", description = "Creates a new Item")
    ResponseEntity createItem(@Valid @RequestBody CreateItemRequest itemToCreate){
        return ResponseEntity.ok(createItem.process(itemToCreate));
    }

    @PutMapping()
    @Operation(summary = "Edit Item", description = "Edits existing Item")
    ResponseEntity editItem(@Valid @RequestBody EditItemRequest itemToEdit)
    {
        return ResponseEntity.ok(editItem.process(itemToEdit));
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Archive Item", description = "Archives existing Item")
    ResponseEntity archiveItem( @RequestParam UUID itemToArchive){
        ArchiveItemRequest itemRequest = ArchiveItemRequest.builder()
                .id(itemToArchive)
                .build();
         return ResponseEntity.ok(archiveItem.process(itemRequest));
    }

    @GetMapping("/{id}")
    @Operation
    ResponseEntity getItem(@PathVariable UUID id){
        GetItemRequest getItemRequest = GetItemRequest.builder()
                .id(id)
                .build();
        return ResponseEntity.ok(getItem.process(getItemRequest));
    }

    @GetMapping("/all/{input}/{page}")//?page={page}
    public ResponseEntity<GetAllItemsResponse> getItemsByTag(@PathVariable String input, @PathVariable Integer page){
        GetAllItemsRequest request = GetAllItemsRequest.builder()
                .tagTitle(input)
                .page(page)
                .build();
        return ResponseEntity.ok(getAllItems.process(request));
    }

    @GetMapping("/title/{title}/{page}")
    public ResponseEntity<SearchByTitleResponse> searchByTitle(@PathVariable String title, @PathVariable Integer page){
        SearchByTitleRequest request = SearchByTitleRequest.builder()
                .titleRegex(title)
                .page(page)
                .build();
        return ResponseEntity.ok(searchByTitle.process(request));
    }

}
//localhost:8080/all/cat-food/1
//localhost:8080/all/cat-food?page=1
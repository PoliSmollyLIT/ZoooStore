package com.example.zooostore.rest.controllers;

import com.example.zooostore.api.operations.item.archive.ArchiveItemRequest;
import com.example.zooostore.api.operations.item.create.CreateItemRequest;
import com.example.zooostore.api.operations.item.edit.EditItemRequest;
import com.example.zooostore.api.operations.item.get.GetItemRequest;
import com.example.zooostore.api.operations.item.getall.GetAllItemsRequest;
import com.example.zooostore.api.operations.item.getall.GetAllItemsResponse;
import com.example.zooostore.core.operations.item.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
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
    private final ArchiveItemImpl archiveItem;
    private final CreateItemImpl createItem;
    private final EditItemImpl editItem;
    private final GetItemImpl getItem;
    private final GetAllItemsImpl getAllItems;

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

    @GetMapping("/all")
    public ResponseEntity getItemsByTag(@RequestParam String input){
        GetAllItemsRequest request = GetAllItemsRequest.builder()
                .tagTitle(input)
                .build();
        return ResponseEntity.ok(getAllItems.process(request));
    }

}

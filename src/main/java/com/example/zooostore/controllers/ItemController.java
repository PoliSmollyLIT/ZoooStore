package com.example.zooostore.controllers;

import com.example.zooostore.api.operations.item.archive.ArchiveItemRequest;
import com.example.zooostore.api.operations.item.create.CreateItemRequest;
import com.example.zooostore.api.operations.item.edit.EditItemRequest;
import com.example.zooostore.business.operations.item.ArchiveItemImpl;
import com.example.zooostore.business.operations.item.CreateItemImpl;
import com.example.zooostore.business.operations.item.EditItemImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/zoostore/item")
@Tag(name = "Zoostsore", description = "API for working with items")
@RequiredArgsConstructor
public class ItemController {
    private final ArchiveItemImpl archiveItem;
    private final CreateItemImpl createItem;
    private final EditItemImpl editItem;

    @PostMapping("/create")
    @Operation(summary = "Create Item", description = "Creates a new Item")
    ResponseEntity createItem(@RequestBody CreateItemRequest itemToCreate){
        return ResponseEntity.ok(createItem.createItem(itemToCreate));
    }

    @PostMapping("/edit")
    @Operation(summary = "Edit Item", description = "Edits existing Item")
    ResponseEntity editItem(@RequestBody EditItemRequest itemToEdit)
    {
        return ResponseEntity.ok(editItem.editItem(itemToEdit));
    }

    @PostMapping("/archive/{uuid}")
    @Operation(summary = "Archive Item", description = "Archives existing Item")
    ResponseEntity archiveItem(@RequestParam UUID itemToArchive){
        ArchiveItemRequest itemRequest = ArchiveItemRequest.builder()
                .id(itemToArchive)
                .build();
         return ResponseEntity.ok(archiveItem.archiveItem(itemRequest));
    }
}

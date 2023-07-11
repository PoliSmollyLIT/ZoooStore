package com.example.zooostore.controllers;

import com.example.zooostore.api.dto.ItemInput;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zoostore")
@Tag(name = "Zoostsore", description = "API for selling things for pets")
public class ItemServiceController {


    @PostMapping("/item/create")
    @Operation(summary = "Create Item", description = "Creates a new Item")
    ResponseEntity createItem(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.ok("Succssess");
    }

    @PostMapping("/tag/create")
    @Operation(summary = "Create Tag", description = "Creates a new Tag")
    ResponseEntity createTag(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.ok("Succssess");
    }

    @PostMapping("/item/edit")
    @Operation(summary = "Edit Item", description = "Edits existing Item")
    ResponseEntity editItem(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.ok("Succssess");
    }

    @PostMapping("/tag/edit")
    @Operation(summary = "Edit Tag", description = "Edits existing Tag")
    ResponseEntity editTag(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.ok("Succssess");
    }

    @PostMapping("/item/archive")
    @Operation(summary = "Archive Item", description = "Archives existing Item")
    ResponseEntity archiveItem(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.ok("Succssess");
    }
}

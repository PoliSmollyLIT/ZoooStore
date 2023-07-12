package com.example.zooostore.controllers;

import com.example.zooostore.api.operations.item.create.CreateItemRequest;
import com.example.zooostore.api.operations.item.edit.EditItemRequest;
import com.example.zooostore.api.operations.tag.create.CreateTagRequest;
import com.example.zooostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zooostore.api.operations.tag.edit.EditTagRequest;
import com.example.zooostore.business.operations.tag.CreateTagImpl;
import com.example.zooostore.business.operations.tag.DeleteTagImpl;
import com.example.zooostore.business.operations.tag.EditTagImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoostore/tag")
@RequiredArgsConstructor
@Tag(name = "Zoostsore", description = "API for working with tags")
public class TagController {
    private final CreateTagImpl createTag;
    private final DeleteTagImpl deleteTag;
    private final EditTagImpl editTag;

    @PostMapping("/create")
    @Operation(summary = "Create Tag", description = "Creates a new Tag")
    ResponseEntity createTag(@RequestBody CreateTagRequest tagToCreate){
        return ResponseEntity.ok(createTag.createTag(tagToCreate));
    }

    @PostMapping("/edit")
    @Operation(summary = "Edit Tag", description = "Edits existing Tag")
    ResponseEntity editTag(@RequestBody EditTagRequest tagToEdit) {
        return ResponseEntity.ok(editTag.editTag(tagToEdit));
    }

    @PostMapping("/delete")
    @Operation(summary = "Delete Tag", description = "Deletes an existing Tag")
    ResponseEntity deleteTag(@RequestBody DeleteTagRequest tagToDelete){
        return ResponseEntity.ok(deleteTag.deleteTag(tagToDelete));
    }

}

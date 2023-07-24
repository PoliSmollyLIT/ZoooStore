package com.example.zooostore.rest.controllers;

import com.example.zooostore.api.operations.tag.create.CreateTagRequest;
import com.example.zooostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zooostore.api.operations.tag.edit.EditTagRequest;
import com.example.zooostore.core.operations.tag.CreateTagImpl;
import com.example.zooostore.core.operations.tag.DeleteTagImpl;
import com.example.zooostore.core.operations.tag.EditTagImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/zoostore/tag")
@RequiredArgsConstructor
@Tag(name = "Zoostsore", description = "API for working with tags")
public class TagController {
    private final CreateTagImpl createTag;
    private final DeleteTagImpl deleteTag;
    private final EditTagImpl editTag;

    @PostMapping()
    @Operation(summary = "Create Tag", description = "Creates a new Tag")
    ResponseEntity createTag(@Valid @RequestBody CreateTagRequest tagToCreate){
        return ResponseEntity.ok(createTag.process(tagToCreate));
    }

    @PutMapping()
    @Operation(summary = "Edit Tag", description = "Edits existing Tag")
    ResponseEntity editTag(  @Valid @RequestBody EditTagRequest tagToEdit) {
        return ResponseEntity.ok(editTag.process(tagToEdit));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete Tag", description = "Deletes an existing Tag")
    ResponseEntity deleteTag( @Valid @RequestBody Long id){
        DeleteTagRequest deleteTagRequest = DeleteTagRequest.builder()
                .id(id)
                .build();
        return ResponseEntity.ok(deleteTag.process(deleteTagRequest));
    }

}

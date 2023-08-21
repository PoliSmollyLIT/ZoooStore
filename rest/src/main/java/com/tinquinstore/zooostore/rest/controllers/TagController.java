package com.tinquinstore.zooostore.rest.controllers;

import com.tinquinstore.zooostore.api.operations.tag.create.CreateTagRequest;
import com.tinquinstore.zooostore.api.operations.tag.delete.DeleteTagRequest;
import com.tinquinstore.zooostore.api.operations.tag.edit.EditTagRequest;
import com.tinquinstore.zooostore.core.operations.tag.CreateTagCore;
import com.tinquinstore.zooostore.core.operations.tag.DeleteTagCore;
import com.tinquinstore.zooostore.core.operations.tag.EditTagCore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zoostore/tag")
@RequiredArgsConstructor
@Tag(name = "Zoostsore", description = "API for working with tags")
public class TagController {
    private final CreateTagCore createTag;
    private final DeleteTagCore deleteTag;
    private final EditTagCore editTag;

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
    ResponseEntity deleteTag( @Valid @PathVariable Long id){
        DeleteTagRequest deleteTagRequest = DeleteTagRequest.builder()
                .id(id)
                .build();
        return ResponseEntity.ok(deleteTag.process(deleteTagRequest));
    }

}

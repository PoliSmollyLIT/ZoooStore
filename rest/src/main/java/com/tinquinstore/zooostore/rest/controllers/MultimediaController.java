package com.tinquinstore.zooostore.rest.controllers;

import com.tinquinstore.zooostore.api.operations.multimedia.create.CreateMultimediaRequest;
import com.tinquinstore.zooostore.core.operations.multimedia.CreateMultimediaCore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoostore/multimedia")
@RequiredArgsConstructor
@Tag(name = "Zoostore", description = "API for working with multimedia")
public class MultimediaController {
    private final CreateMultimediaCore createMultimedia;

    @PostMapping()
    @Operation(summary = "Craete Multimedia", description = "Creates a new Multimedia")
    ResponseEntity createMultimedia(@Valid @RequestBody CreateMultimediaRequest multimediaToCreate){
        return ResponseEntity.ok(createMultimedia.process(multimediaToCreate));
    }
}

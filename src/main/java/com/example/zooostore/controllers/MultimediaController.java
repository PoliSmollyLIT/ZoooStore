package com.example.zooostore.controllers;

import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaRequest;
import com.example.zooostore.business.operations.multimedia.CreateMultimediaImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
    private final CreateMultimediaImpl createMultimedia;

    @PostMapping("/create")
    @Operation(summary = "Craete Multimedia", description = "Creates a new Multimedia")
    ResponseEntity createMultimedia(@RequestBody CreateMultimediaRequest multimediaToCreate){
        return ResponseEntity.ok(createMultimedia.createMultimedia(multimediaToCreate));
    }
}

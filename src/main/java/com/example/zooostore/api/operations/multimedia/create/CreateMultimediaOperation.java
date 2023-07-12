package com.example.zooostore.api.operations.multimedia.create;

import com.example.zooostore.api.operations.item.create.CreateItemResponse;

public interface CreateMultimediaOperation {
    CreateItemResponse createMultimedia(CreateMultimediaRequest multimedia);
}

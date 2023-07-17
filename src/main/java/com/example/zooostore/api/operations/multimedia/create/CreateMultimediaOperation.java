package com.example.zooostore.api.operations.multimedia.create;

import com.example.zooostore.api.operations.base.OperationProcessor;
import com.example.zooostore.api.operations.item.create.CreateItemResponse;

public interface CreateMultimediaOperation extends OperationProcessor<CreateMultimediaResponse, CreateMultimediaRequest> {
    CreateMultimediaResponse process(CreateMultimediaRequest multimedia);
}

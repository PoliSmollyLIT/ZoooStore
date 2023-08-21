package com.tinquinstore.zooostore.api.operations.multimedia.create;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface CreateMultimediaOperation extends OperationProcessor<CreateMultimediaResponse, CreateMultimediaRequest> {
    CreateMultimediaResponse process(CreateMultimediaRequest multimedia);
}

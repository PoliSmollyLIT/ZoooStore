package com.example.zooostore.api.operations.multimedia.create;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMultimediaResponse implements OperationResult {
    private UUID id;
    private String url;
    private UUID item;
}

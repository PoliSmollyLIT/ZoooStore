package com.example.zooostore.api.operations.multimedia.create;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMultimediaRequest implements OperationInput {
    private String url;
    private UUID item;
}

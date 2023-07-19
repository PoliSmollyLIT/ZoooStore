package com.example.zooostore.api.operations.multimedia.create;

import com.example.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMultimediaResponse implements OperationResult {
    @NotBlank
    private UUID id;
    @NotBlank
    private String url;
    @NotBlank
    private UUID item;
}

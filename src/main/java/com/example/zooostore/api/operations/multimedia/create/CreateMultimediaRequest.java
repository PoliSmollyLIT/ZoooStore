package com.example.zooostore.api.operations.multimedia.create;

import com.example.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMultimediaRequest implements OperationInput {
    @NotBlank
    private String url;
    @NotBlank
    private UUID item;
}

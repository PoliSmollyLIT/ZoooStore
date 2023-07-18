package com.example.zooostore.api.operations.item.get;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemMultimediaOutput {
    @NotBlank
    private UUID id;
    @NotBlank
    private  String url;
}

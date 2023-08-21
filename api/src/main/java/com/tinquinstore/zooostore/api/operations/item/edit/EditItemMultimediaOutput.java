package com.tinquinstore.zooostore.api.operations.item.edit;

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

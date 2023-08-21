package com.tinquinstore.zooostore.api.operations.item.edit;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemTagOutput {
    @NotBlank
    private Long id;
    @NotBlank
    private String title;
}

package com.tinquinstore.zooostore.api.operations.item.edit;

import com.tinquinstore.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemRequest implements OperationInput {
    @NotBlank
    private UUID id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private UUID vendor;
}

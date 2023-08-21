package com.tinquinstore.zooostore.api.operations.item.edit;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemVendorOutput {
    @NotBlank
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
}

package com.example.zooostore.api.operations.item.create;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemVendorOutput {
    @NotBlank
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String phone;

}

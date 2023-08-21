package com.tinquinstore.zooostore.api.operations.vendor.edit;

import com.tinquinstore.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorRequest implements OperationInput {
    @NotBlank
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
}

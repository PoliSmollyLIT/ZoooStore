package com.example.zooostore.api.operations.vendor.create;

import com.example.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorRequest implements OperationInput {
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
}

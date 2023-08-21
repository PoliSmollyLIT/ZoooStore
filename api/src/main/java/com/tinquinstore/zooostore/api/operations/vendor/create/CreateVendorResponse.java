package com.tinquinstore.zooostore.api.operations.vendor.create;

import com.tinquinstore.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorResponse implements OperationResult {
    @NotBlank
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
}

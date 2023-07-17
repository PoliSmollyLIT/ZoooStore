package com.example.zooostore.api.operations.vendor.create;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorResponse implements OperationResult {
    private UUID id;
    private String name;
    private String phone;
}

package com.example.zooostore.api.operations.vendor.edit;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorResponse implements OperationResult {
    private UUID id;
    private String name;
    private String phone;
}

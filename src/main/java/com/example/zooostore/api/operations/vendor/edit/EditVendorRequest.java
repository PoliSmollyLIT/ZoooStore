package com.example.zooostore.api.operations.vendor.edit;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorRequest implements OperationInput {
    private UUID id;
    private String name;
    private String phone;
}

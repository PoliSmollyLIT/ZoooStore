package com.example.zooostore.api.operations.vendor.create;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorRequest implements OperationInput {
    private String name;
    private String phone;
}

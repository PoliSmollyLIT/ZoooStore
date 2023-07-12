package com.example.zooostore.api.operations.vendor.create;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorRequest {
    private String name;
    private String phone;
}
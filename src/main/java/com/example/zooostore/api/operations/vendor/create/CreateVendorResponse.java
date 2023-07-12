package com.example.zooostore.api.operations.vendor.create;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorResponse {
    private UUID id;
    private String name;
    private String phone;
}

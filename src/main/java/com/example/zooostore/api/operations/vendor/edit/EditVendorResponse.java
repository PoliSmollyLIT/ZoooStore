package com.example.zooostore.api.operations.vendor.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorResponse {
    private UUID id;
    private String name;
    private String phone;
}

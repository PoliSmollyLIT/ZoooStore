package com.example.zooostore.api.operations.vendor.edit;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorRequest {
    private String name;
    private String phone;
}

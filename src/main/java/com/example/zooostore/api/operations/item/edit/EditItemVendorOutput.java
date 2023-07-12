package com.example.zooostore.api.operations.item.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemVendorOutput {
    private UUID id;
    private String name;
    private String phone;
}

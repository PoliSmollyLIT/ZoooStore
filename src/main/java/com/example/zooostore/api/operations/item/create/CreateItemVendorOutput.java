package com.example.zooostore.api.operations.item.create;

import com.example.zooostore.data.models.Item;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemVendorOutput {
    private UUID id;
    private String name;
    private String phone;
    private Set<Item> items;
}

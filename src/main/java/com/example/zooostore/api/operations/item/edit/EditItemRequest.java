package com.example.zooostore.api.operations.item.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemRequest {
    private UUID id;
    private String title;
    private String description;
    private UUID vendor;
}

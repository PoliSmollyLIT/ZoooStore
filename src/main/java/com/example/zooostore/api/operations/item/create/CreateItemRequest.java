package com.example.zooostore.api.operations.item.create;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemRequest {
        private String title;
        private String description;
        private UUID vendor;
        private Set<Long> tags;
        private boolean archive;
}

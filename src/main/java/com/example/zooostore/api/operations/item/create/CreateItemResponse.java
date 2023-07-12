package com.example.zooostore.api.operations.item.create;

import lombok.*;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemResponse {
        private UUID id;
        private String title;
        private String description;
        private UUID vendor;
        private Set<UUID> multimedia;
        private Set<Long> tags;
        private boolean archive;
}

package com.example.zooostore.api.operations.item.create;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemResponse implements OperationResult {
        private UUID id;
        private String title;
        private String description;
        private UUID vendor;
        private Set<UUID> multimedia;
        private Set<Long> tags;
        private boolean archive;
}

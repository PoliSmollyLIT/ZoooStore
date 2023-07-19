package com.example.zooostore.api.operations.item.create;

import com.example.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemResponse implements OperationResult {
        @NotBlank
        private UUID id;
        @NotBlank
        private String title;
        @NotBlank
        private String description;
        @NotBlank
        private UUID vendor;
        private Set<UUID> multimedia;
        private Set<Long> tags;
        @NotBlank
        private boolean archive;
}

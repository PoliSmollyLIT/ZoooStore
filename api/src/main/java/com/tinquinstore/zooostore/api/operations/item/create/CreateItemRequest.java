package com.tinquinstore.zooostore.api.operations.item.create;

import com.tinquinstore.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemRequest implements OperationInput {
        @NotBlank
        private String title;
        @NotBlank
        private String description;
        @NotBlank
        private UUID vendor;
        private Set<Long> tags;
        @NotBlank
        private boolean archive;
}

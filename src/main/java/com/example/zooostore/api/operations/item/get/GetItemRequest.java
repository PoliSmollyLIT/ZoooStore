package com.example.zooostore.api.operations.item.get;

import com.example.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemRequest implements OperationInput {
        @NotBlank
        private UUID id;
}

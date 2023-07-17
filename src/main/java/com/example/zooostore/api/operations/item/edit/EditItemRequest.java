package com.example.zooostore.api.operations.item.edit;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemRequest implements OperationInput {
    private UUID id;
    private String title;
    private String description;
    private UUID vendor;
}

package com.example.zooostore.api.operations.tag.edit;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditTagRequest implements OperationInput {
    private Long id;
    private String title;
}

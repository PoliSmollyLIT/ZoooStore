package com.example.zooostore.api.operations.tag.edit;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditTagResponse implements OperationResult {
    private Long id;
    private String title;
}

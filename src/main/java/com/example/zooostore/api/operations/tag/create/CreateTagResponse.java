package com.example.zooostore.api.operations.tag.create;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTagResponse implements OperationResult {
    private Long id;
    private String title;
}

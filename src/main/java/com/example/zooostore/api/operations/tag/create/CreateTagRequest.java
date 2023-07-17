package com.example.zooostore.api.operations.tag.create;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTagRequest implements OperationInput {
    private String title;
}

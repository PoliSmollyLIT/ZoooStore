package com.example.zooostore.api.operations.tag.create;

import com.example.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTagRequest implements OperationInput {
    @NotBlank
    private String title;
}

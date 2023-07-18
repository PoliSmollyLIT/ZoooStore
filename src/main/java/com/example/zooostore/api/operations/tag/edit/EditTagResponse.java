package com.example.zooostore.api.operations.tag.edit;

import com.example.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditTagResponse implements OperationResult {
    @NotBlank
    private Long id;
    @NotBlank
    private String title;
}

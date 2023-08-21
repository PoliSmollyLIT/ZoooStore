package com.tinquinstore.zooostore.api.operations.tag.edit;

import com.tinquinstore.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditTagRequest implements OperationInput {
    @NotBlank
    private Long id;
    @NotBlank
    private String title;
}

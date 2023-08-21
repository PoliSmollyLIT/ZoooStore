package com.tinquinstore.zooostore.api.operations.tag.delete;

import com.tinquinstore.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTagRequest implements OperationInput {
    @NotBlank
    private Long id;
}

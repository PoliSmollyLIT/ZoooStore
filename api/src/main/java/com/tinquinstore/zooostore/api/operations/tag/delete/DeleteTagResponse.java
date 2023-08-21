package com.tinquinstore.zooostore.api.operations.tag.delete;

import com.tinquinstore.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTagResponse implements OperationResult {
    @NotBlank
    private Long id;
}

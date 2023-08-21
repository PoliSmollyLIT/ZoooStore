package com.tinquinstore.zooostore.api.operations.tag.create;

import com.tinquinstore.zooostore.api.operations.base.OperationResult;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTagResponse implements OperationResult {
    @NotBlank
    private Long id;
    @NotBlank
    private String title;
}

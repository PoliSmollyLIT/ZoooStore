package com.example.zooostore.api.operations.tag.delete;

import com.example.zooostore.api.operations.base.OperationInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTagRequest implements OperationInput{
    @NotBlank
    private Long id;
}

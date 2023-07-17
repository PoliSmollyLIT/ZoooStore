package com.example.zooostore.api.operations.tag.delete;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTagResponse implements OperationResult {
    private Long id;
}

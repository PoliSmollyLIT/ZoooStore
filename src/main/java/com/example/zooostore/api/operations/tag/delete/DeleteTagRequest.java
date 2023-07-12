package com.example.zooostore.api.operations.tag.delete;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTagRequest {
    private Long id;
}

package com.example.zooostore.api.operations.tag.create;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTagResponse {
    private Long id;
    private String title;
}

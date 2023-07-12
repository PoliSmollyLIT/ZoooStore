package com.example.zooostore.api.operations.tag.edit;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditTagResponse {
    private Long id;
    private String title;
}

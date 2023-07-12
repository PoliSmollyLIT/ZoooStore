package com.example.zooostore.api.operations.multimedia.create;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMultimediaRequest {
    private String url;
    private UUID item;
}

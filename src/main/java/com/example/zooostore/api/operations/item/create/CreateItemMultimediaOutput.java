package com.example.zooostore.api.operations.item.create;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemMultimediaOutput {
    private UUID id;
    private  String url;
}

package com.example.zooostore.api.operations.item.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemMultimediaOutput {
    private UUID id;
    private  String url;
}

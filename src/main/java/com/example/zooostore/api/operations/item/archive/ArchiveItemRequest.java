package com.example.zooostore.api.operations.item.archive;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveItemRequest {
    private UUID id;
}

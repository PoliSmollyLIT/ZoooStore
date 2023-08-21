package com.tinquinstore.zooostore.api.operations.item.searchbytitle;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchByTitleSingleItem {
    private UUID id;
    private String title;
    private String description;
    private UUID vendorId;
    private Set<UUID> multimediaIds;
    private Set<Long> tagIds;

}

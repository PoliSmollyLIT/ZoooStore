package com.tinquinstore.zooostore.api.operations.item.searchbytitle;

import com.tinquinstore.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchByTitleResponse implements OperationResult {
    private List<SearchByTitleSingleItem> items;
}

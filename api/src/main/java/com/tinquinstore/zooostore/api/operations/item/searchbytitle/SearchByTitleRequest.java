package com.tinquinstore.zooostore.api.operations.item.searchbytitle;

import com.tinquinstore.zooostore.api.operations.base.OperationInput;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchByTitleRequest implements OperationInput {
    private String titleRegex;
    private Integer page;
}

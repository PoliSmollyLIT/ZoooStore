package com.example.zooostore.api.operations.item.getall;

import com.example.zooostore.api.operations.base.OperationInput;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllItemsRequest implements OperationInput {
    private String tagTitle;
    private Integer page;
}

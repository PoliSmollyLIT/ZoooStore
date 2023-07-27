package com.example.zooostore.api.operations.item.getall;

import com.example.zooostore.api.operations.base.OperationResult;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllItemsResponse implements OperationResult {
    private List<GetSingleItemResponse> items;
}

package com.example.zooostore.api.operations.item.searchbytitle;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface SearchByTitleOperation extends OperationProcessor<SearchByTitleResponse, SearchByTitleRequest> {
    SearchByTitleResponse process(SearchByTitleRequest request);
}

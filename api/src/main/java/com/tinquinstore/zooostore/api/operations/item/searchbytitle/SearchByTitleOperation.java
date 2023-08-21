package com.tinquinstore.zooostore.api.operations.item.searchbytitle;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface SearchByTitleOperation extends OperationProcessor<SearchByTitleResponse, SearchByTitleRequest> {
    SearchByTitleResponse process(SearchByTitleRequest request);
}

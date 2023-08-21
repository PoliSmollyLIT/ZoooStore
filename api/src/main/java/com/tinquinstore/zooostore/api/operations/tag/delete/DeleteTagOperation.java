package com.tinquinstore.zooostore.api.operations.tag.delete;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface DeleteTagOperation extends OperationProcessor<DeleteTagResponse, DeleteTagRequest> {
    DeleteTagResponse process(DeleteTagRequest id);
}

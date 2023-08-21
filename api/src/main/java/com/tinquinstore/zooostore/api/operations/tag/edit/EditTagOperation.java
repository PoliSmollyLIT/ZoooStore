package com.tinquinstore.zooostore.api.operations.tag.edit;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface EditTagOperation extends OperationProcessor<EditTagResponse, EditTagRequest> {
    EditTagResponse process(EditTagRequest tag);
}

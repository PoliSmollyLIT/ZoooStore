package com.tinquinstore.zooostore.api.operations.vendor.edit;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface EditVendorOperation extends OperationProcessor<EditVendorResponse, EditVendorRequest> {
    EditVendorResponse process(EditVendorRequest vendor);
}


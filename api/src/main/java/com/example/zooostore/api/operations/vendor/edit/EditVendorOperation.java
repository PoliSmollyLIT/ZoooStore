package com.example.zooostore.api.operations.vendor.edit;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface EditVendorOperation extends OperationProcessor<EditVendorResponse, EditVendorRequest> {
    EditVendorResponse process(EditVendorRequest vendor);
}


package com.example.zooostore.api.operations.vendor.create;

import com.example.zooostore.api.operations.base.OperationProcessor;

public interface CreateVendorOperation extends OperationProcessor<CreateVendorResponse, CreateVendorRequest> {
    CreateVendorResponse process(CreateVendorRequest vendor);
}

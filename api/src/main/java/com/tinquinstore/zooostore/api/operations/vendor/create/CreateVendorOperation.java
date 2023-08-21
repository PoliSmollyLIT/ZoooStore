package com.tinquinstore.zooostore.api.operations.vendor.create;

import com.tinquinstore.zooostore.api.operations.base.OperationProcessor;

public interface CreateVendorOperation extends OperationProcessor<CreateVendorResponse, CreateVendorRequest> {
    CreateVendorResponse process(CreateVendorRequest vendor);
}

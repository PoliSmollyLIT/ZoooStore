package com.example.zooostore.api.operations.vendor.edit;

import com.example.zooostore.api.operations.item.edit.EditItemRequest;
import com.example.zooostore.api.operations.item.edit.EditItemResponse;

public interface EditVendorOperation {
    EditItemResponse editVendor(EditItemRequest vemdor);
}


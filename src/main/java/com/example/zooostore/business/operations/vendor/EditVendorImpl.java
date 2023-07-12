package com.example.zooostore.business.operations.vendor;

import com.example.zooostore.api.operations.vendor.edit.EditVendorOperation;
import com.example.zooostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zooostore.api.operations.vendor.edit.EditVendorResponse;
import com.example.zooostore.data.models.Vendor;
import com.example.zooostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditVendorImpl implements EditVendorOperation {
    private final VendorRepository vendorRepository;
    @Override
    public EditVendorResponse editVendor(EditVendorRequest vendor) {
        Vendor vendorEntity = vendorRepository.findVendorByName(vendor.getName());
        vendorEntity.setName(vendor.getName());
        vendorEntity.setPhone(vendor.getPhone());
        vendorRepository.save(vendorEntity);
        EditVendorResponse vendorResponse = EditVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .phone(vendorEntity.getPhone())
                .build();
        return vendorResponse;
    }
}

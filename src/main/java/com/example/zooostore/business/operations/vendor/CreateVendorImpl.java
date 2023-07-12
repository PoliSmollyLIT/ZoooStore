package com.example.zooostore.business.operations.vendor;

import com.example.zooostore.api.operations.vendor.create.CreateVendorOperation;
import com.example.zooostore.api.operations.vendor.create.CreateVendorRequest;
import com.example.zooostore.api.operations.vendor.create.CreateVendorResponse;
import com.example.zooostore.data.models.Vendor;
import com.example.zooostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateVendorImpl implements CreateVendorOperation {
    private final VendorRepository vendorRepository;
    @Override
    public CreateVendorResponse createVendor(CreateVendorRequest vendor) {
        Vendor vendorEntity = Vendor.builder()
                .name(vendor.getName())
                .phone(vendor.getPhone())
                .build();
        vendorRepository.save(vendorEntity);
        CreateVendorResponse vendorResponse = CreateVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .phone(vendorEntity.getPhone())
                .build();
        return vendorResponse;
    }
}

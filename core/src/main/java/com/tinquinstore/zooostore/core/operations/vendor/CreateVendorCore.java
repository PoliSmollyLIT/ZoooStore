package com.tinquinstore.zooostore.core.operations.vendor;

import com.tinquinstore.zooostore.api.operations.vendor.create.CreateVendorOperation;
import com.tinquinstore.zooostore.api.operations.vendor.create.CreateVendorRequest;
import com.tinquinstore.zooostore.api.operations.vendor.create.CreateVendorResponse;
import com.tinquinstore.zooostore.persistance.models.Vendor;
import com.tinquinstore.zooostore.persistance.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateVendorCore implements CreateVendorOperation {
    private final VendorRepository vendorRepository;
    @Override
    public CreateVendorResponse process(CreateVendorRequest vendor) {
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

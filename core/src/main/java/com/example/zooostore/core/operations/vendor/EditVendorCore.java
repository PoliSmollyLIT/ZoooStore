package com.example.zooostore.core.operations.vendor;

import com.example.zooostore.api.operations.vendor.edit.EditVendorOperation;
import com.example.zooostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zooostore.api.operations.vendor.edit.EditVendorResponse;
import com.example.zooostore.persistance.models.Vendor;
import com.example.zooostore.persistance.repositories.VendorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditVendorCore implements EditVendorOperation {
    private final VendorRepository vendorRepository;
    @Override
    public EditVendorResponse process(EditVendorRequest vendor) {
        Vendor vendorEntity = vendorRepository.findVendorById(vendor.getId()).orElseThrow(()-> new EntityNotFoundException("Vendor with this id does not exist"));
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

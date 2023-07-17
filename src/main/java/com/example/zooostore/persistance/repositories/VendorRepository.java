package com.example.zooostore.persistance.repositories;

import com.example.zooostore.persistance.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
    Vendor findVendorById(UUID id);
    Vendor findVendorByName(String name);
}

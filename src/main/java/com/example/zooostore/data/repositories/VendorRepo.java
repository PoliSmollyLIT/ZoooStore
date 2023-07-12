package com.example.zooostore.data.repositories;

import com.example.zooostore.data.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepo extends JpaRepository<Vendor, UUID> {
    Vendor findVendorById(UUID id);
}

package com.example.zooostore.persistance.repositories;

import com.example.zooostore.persistance.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
    Optional<Vendor> findVendorById(UUID id);
    Optional<Vendor> findVendorByName(String name);
}

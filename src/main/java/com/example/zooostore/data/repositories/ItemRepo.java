package com.example.zooostore.data.repositories;

import com.example.zooostore.data.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepo extends JpaRepository<Item, UUID> {
}

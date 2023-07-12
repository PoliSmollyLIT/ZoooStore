package com.example.zooostore.data.repositories;

import com.example.zooostore.data.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
    Item findItemById(UUID id);
}

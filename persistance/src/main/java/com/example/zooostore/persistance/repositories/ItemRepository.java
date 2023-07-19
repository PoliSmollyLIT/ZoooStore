package com.example.zooostore.persistance.repositories;

import com.example.zooostore.persistance.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
   Optional<Item> findItemById(UUID id);

}

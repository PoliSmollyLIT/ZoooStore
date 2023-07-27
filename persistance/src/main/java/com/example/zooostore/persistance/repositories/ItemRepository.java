package com.example.zooostore.persistance.repositories;

import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ItemRepository extends JpaRepository<Item, UUID> {
   Optional<Item> findItemById(UUID id);
//   List<Item> findAllByTags(Set<Tag> tags);

}

package com.example.zooostore.persistance.repositories;

import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.models.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ItemRepository extends JpaRepository<Item, UUID> {
   Optional<Item> findItemById(UUID id);
   Page<Item> findAllByTags_Id(Long tags, Pageable pageable);

}

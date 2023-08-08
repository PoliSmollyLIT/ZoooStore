package com.example.zooostore.persistance.repositories;

import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.models.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface ItemRepository extends JpaRepository<Item, UUID> {
   Optional<Item> findItemById(UUID id);
   Page<Item> findAllByTags_Id(Long tags, Pageable pageable);

   @Query(value = """
      SELECT * FROM zoostore.items\s
      WHERE zoostore.items.title REGEXP :titleRegex
      ORDER BY zoostore.items.title ASC;
        """, nativeQuery = true)
   Page<Item> findAllByRegexTitle(String titleRegex, Pageable pageable);

  // Optional<Item> findItemByTitleRegex(String title, String regex); // [cat]+

}

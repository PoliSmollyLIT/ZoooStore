package com.example.zooostore.persistance.repositories;


import com.example.zooostore.persistance.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findTagById(Long id);
    Set<Tag> findTagByIdIn(Set<Long> ids);
}

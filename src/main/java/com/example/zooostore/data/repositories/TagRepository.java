package com.example.zooostore.data.repositories;


import com.example.zooostore.data.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findTagById(Long id);
    Set<Tag> findTagByIdIn(Set<Long> ids);
}

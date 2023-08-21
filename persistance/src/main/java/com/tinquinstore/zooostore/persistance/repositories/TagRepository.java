package com.tinquinstore.zooostore.persistance.repositories;


import com.tinquinstore.zooostore.persistance.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Optional<Tag> findTagById(Long id);
    Set<Tag> findTagByIdIn(Set<Long> ids);
//    Set<Tag> findAllByTitle(String title);

    Optional<Tag> findByTitle(String title);
}

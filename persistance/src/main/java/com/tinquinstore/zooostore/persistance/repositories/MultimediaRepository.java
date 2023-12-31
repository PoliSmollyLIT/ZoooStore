package com.tinquinstore.zooostore.persistance.repositories;

import com.tinquinstore.zooostore.persistance.models.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MultimediaRepository extends JpaRepository<Multimedia, UUID> {
}

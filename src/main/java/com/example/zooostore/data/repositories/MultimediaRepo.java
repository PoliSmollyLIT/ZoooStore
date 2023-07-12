package com.example.zooostore.data.repositories;

import com.example.zooostore.data.models.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MultimediaRepo extends JpaRepository<Multimedia, UUID> {
}

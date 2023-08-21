package com.tinquinstore.zooostore.persistance.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "multimedia")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Multimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "url")
    private String url;

    @ManyToOne
    private Item item;
}

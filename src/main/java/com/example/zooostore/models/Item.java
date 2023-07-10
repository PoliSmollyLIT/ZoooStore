package com.example.zooostore.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "items")
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "vendor")
    @ManyToOne
    @JoinColumn(referencedColumnName = "items", nullable = false)
    private Vendor vendor;

    @Column(name = "multimedia")
    @OneToMany
    private Set<Multimedia> multimedia;

    @Column(name = "tag")
    @ManyToMany
    private Set<Tag> tags;

    private boolean archived;
}

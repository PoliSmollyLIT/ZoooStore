package com.example.zooostore.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "items")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
   // @JoinColumn(referencedColumnName = "items", nullable = false)
    private Vendor vendor;

    @OneToMany(mappedBy = "item")
    private Set<Multimedia> multimedia;

    @ManyToMany
    private Set<Tag> tags;

    private boolean archived;
}

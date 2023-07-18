package com.example.zooostore.persistance.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank
    private boolean archived;
}

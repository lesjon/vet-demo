package com.example.vet.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pet {
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Owner owner;
}

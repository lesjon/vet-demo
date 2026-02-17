package com.example.vet.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pet {
    @Id
    long id;

    @Column(name = "name")
    String name;

    public String getName() {
        return name;
    }
}

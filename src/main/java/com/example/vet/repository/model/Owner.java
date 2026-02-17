package com.example.vet.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {
    @Id
    long id;
    String name;

    public String getName() {
        return name;
    }
}

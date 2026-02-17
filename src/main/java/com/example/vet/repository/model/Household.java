package com.example.vet.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Household {
    @Id
    long id;
    String address;

    public String getAddress() {
        return address;
    }
}

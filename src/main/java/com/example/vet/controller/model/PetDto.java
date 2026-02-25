package com.example.vet.controller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class PetDto {
    @Id
    private String id;
    private String name;

}

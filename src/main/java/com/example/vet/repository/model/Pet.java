package com.example.vet.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "Pet")
public class Pet {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Owner owner;

    @ManyToOne
    private Household household;

}

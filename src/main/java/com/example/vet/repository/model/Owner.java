package com.example.vet.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(schema = "Owner")
public class Owner {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    private List<Pet> pets = new ArrayList<>();

    @ManyToOne()
    private Owner owner;
}

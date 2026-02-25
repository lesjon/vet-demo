package com.example.vet.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Owner {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

//    @OneToMany(mappedBy = "Owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Pet> pets = new HashSet<>();

    @ManyToOne()
    private Owner owner;
}

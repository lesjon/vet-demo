package com.example.vet.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(schema = "Household")
public class Household {

    @Id
    private Long id;

    @Column(name = "address")
    private String address;

    @OneToMany
    private List<Pet> pets = new ArrayList<>();

}

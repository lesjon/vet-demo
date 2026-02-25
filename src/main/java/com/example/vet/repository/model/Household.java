package com.example.vet.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Household {

    @Id
    private long id;

    @Column(name = "address")
    private String address;

//    @OneToMany(mappedBy = "Owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Pet> pets = new HashSet<>();

}

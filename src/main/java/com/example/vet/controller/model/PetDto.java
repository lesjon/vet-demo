package com.example.vet.controller.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PetDto {
    @Id
    private String id;
    public String name;


}

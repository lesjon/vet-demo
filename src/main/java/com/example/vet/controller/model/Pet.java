package com.example.vet.controller.model;

public class Pet {

    public String getName() {
        return name;
    }

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public static Pet from(com.example.vet.repository.model.Pet entity) {
        return new Pet(entity.getName());
    }
}

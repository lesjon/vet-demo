package com.example.vet.controller.model;

public class Owner {
    String name;

    public Owner(String name) {
        this.name = name;
    }

    static Owner from(com.example.vet.repository.model.Owner entity) {
        return new Owner(entity.getName());
    }

    public String getName() {
        return name;
    }
}

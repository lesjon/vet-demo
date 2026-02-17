package com.example.vet.controller.model;

public class Household {
    String address;

    public Household(String address) {
        this.address = address;
    }

    static Household from(com.example.vet.repository.model.Household entity) {
        return new Household(entity.getAddress());
    }

    public String getAddress() {
        return address;
    }
}

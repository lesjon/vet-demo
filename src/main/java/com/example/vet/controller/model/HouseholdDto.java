package com.example.vet.controller.model;

import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HouseholdDto {
    @Id
    private String id;
    private String name;
}

package com.example.vet.service;

import com.example.vet.repository.PetRepository;
import com.example.vet.repository.model.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetService {

    private final PetRepository petRepository;

    public VetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getPets() {
        return petRepository.findAll();
    }
}

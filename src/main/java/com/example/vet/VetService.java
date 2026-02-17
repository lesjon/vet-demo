package com.example.vet;

import com.example.vet.controller.model.Pet;
import com.example.vet.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetService {

    private final PetRepository petRepository;

    public VetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getPets() {
        return petRepository.findAll().stream().map(Pet::from).toList();
    }

}

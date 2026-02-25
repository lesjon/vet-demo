package com.example.vet.service;

import com.example.vet.controller.model.PetDto;
import com.example.vet.mapper.PetMapper;
import com.example.vet.repository.PetRepository;
import com.example.vet.repository.model.Pet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VetService {

    private final PetRepository petRepository;
    private PetMapper petMapper;
    public VetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetDto> getPets(Long id) {
        Pet pet = petRepository.findById(id).orElseThrow();
        return petMapper.toDto(pet);
    }

    @Transactional
    public PetDto addPets() {

        PetDto petDto = new PetDto();
        Pet petEntity = petMapper.toEntity(petDto);

        Pet savedPet = petRepository.save(petEntity);

        return (PetDto) petMapper.toDto(savedPet);
    }
}

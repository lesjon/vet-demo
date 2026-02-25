package com.example.vet.mapper;

import com.example.vet.controller.model.PetDto;
import com.example.vet.repository.model.Pet;
import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
public class PetMapper {


    public List<PetDto> toDto(Pet user) {
        return List.of();
    }

    public Pet toEntity(PetDto petDto) {
        return (Pet) List.of();
    }
}


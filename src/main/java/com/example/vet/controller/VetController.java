package com.example.vet.controller;

import com.example.vet.controller.model.PetDto;
import com.example.vet.service.VetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("")
@RestController
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PetDto> getPet(@PathVariable Long id) {
        return ResponseEntity.ok((PetDto) vetService.getPets(id));
    }

    @PostMapping("/pet")
    public ResponseEntity<PetDto> addPet() {
        return ResponseEntity.ok(vetService.addPets());
    }
}


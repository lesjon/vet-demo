package com.example.vet.controller;

import com.example.vet.VetService;
import com.example.vet.controller.model.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/pets")
    public List<Pet> getPets(){
        return vetService.getPets();
    }
}

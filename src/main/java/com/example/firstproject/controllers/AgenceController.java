package com.example.firstproject.controllers;

import com.example.firstproject.entities.Agence;
import com.example.firstproject.services.IAgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agences")
public class AgenceController {

    @Autowired
    IAgenceService agenceService;

    @GetMapping
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/{id}")
    public  Agence getAgenceById(@PathVariable int id) {
        return agenceService.getAgenceById(id);
    }

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.createAgence(agence);
    }

    @PatchMapping("/updateAgence/{id}")
    public Agence updateAgence(@PathVariable int id,@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable int id) {
         agenceService.deleteAgence(id);
    }
}

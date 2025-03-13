package com.example.firstproject.controllers;

import com.example.firstproject.entities.Compte;
import com.example.firstproject.services.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comptes")
public class CompteController {

    @Autowired
    ICompteService compteService;

    @GetMapping
    public List<Compte> getComptes() {
        return compteService.getAllComptes();
    }

    @GetMapping("/{id}")
    public Compte getCompteById(@PathVariable int id) {
        return compteService.getCompteById(id);
    }

    @PostMapping("/addCompte")
    public Compte addCompte(@RequestBody Compte compte) {
        return compteService.createCompte(compte);
    }

    @PatchMapping("/updateCompte/{id}")
    public Compte updateCompte(@PathVariable int id, @RequestBody Compte compte) {
        compte.setId(id);
        return compteService.updateCompte(compte);
    }

    @DeleteMapping("/deleteCompte/{id}")
    public void deleteCompte(@PathVariable int id) {
        compteService.deleteCompteById(id);
    }
}


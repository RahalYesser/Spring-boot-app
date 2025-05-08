package com.example.firstproject.controllers;

import com.example.firstproject.entities.Directeur;
import com.example.firstproject.services.IDirecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directeurs")
public class DirecteurController {

    @Autowired
    IDirecteurService directeurService;

    @GetMapping
    public List<Directeur> getDirecteurs() {
        return directeurService.getAllDirecteurs();
    }

    @GetMapping("/{id}")
    public Directeur getDirecteurById(@PathVariable int id) {
        return directeurService.getDirecteurById(id);
    }

    @PostMapping("/addDirecteur")
    public Directeur addDirecteur(@RequestBody Directeur directeur) {
        return directeurService.createDirecteur(directeur);
    }

    @PatchMapping("/updateDirecteur/{id}")
    public Directeur updateDirecteur(@PathVariable int id, @RequestBody Directeur directeur) {
        directeur.setId(id);
        return directeurService.updateDirecteur(directeur);
    }

    @DeleteMapping("/deleteDirecteur/{id}")
    public void deleteDirecteur(@PathVariable int id) {
        directeurService.deleteDirecteurById(id);
    }

    /*@GetMapping("/getByAgence")
    public Directeur getDirecteurByAgence(@RequestParam String nom) {
        return directeurService.getDirecteurByAgenceNom(nom);
    }*/

    @GetMapping("/getByBanque")
    public Directeur getDirecteurByBanque(@RequestParam String nom) {
        return directeurService.getDirecteurByBanqueNom(nom);
    }


}


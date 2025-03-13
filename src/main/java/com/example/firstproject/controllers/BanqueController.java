package com.example.firstproject.controllers;

import com.example.firstproject.entities.Banque;
import com.example.firstproject.services.IBanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banques")
public class BanqueController {

    @Autowired
    IBanqueService banqueService;

    @GetMapping
    public List<Banque> getBanques() {
        return banqueService.getAllBanques();
    }

    @GetMapping("/{id}")
    public Banque getBanqueById(@PathVariable int id) {
        return banqueService.getBanqueById(id);
    }

    @PostMapping("/addBanque")
    public Banque addBanque(@RequestBody Banque banque) {
        return banqueService.createBanque(banque);
    }

    @PatchMapping("/updateBanque/{id}")
    public Banque updateBanque(@PathVariable int id,@RequestBody Banque banque) {
        banque.setId(id);
        return banqueService.updateBanque(banque);
    }

    @DeleteMapping("/deleteBanque/{id}")
    public void deleteBanque(@PathVariable int id) {
        banqueService.deleteBanque(id);
    }

}

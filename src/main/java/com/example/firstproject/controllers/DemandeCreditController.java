package com.example.firstproject.controllers;

import com.example.firstproject.entities.DemandeCredit;
import com.example.firstproject.services.IDemandeCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demandes-credit")
public class DemandeCreditController {

    @Autowired
    IDemandeCreditService demandeCreditService;

    @GetMapping
    public List<DemandeCredit> getDemandesCredit() {
        return demandeCreditService.getAllDemandeCredit();
    }

    @GetMapping("/{id}")
    public DemandeCredit getDemandeCreditById(@PathVariable int id) {
        return demandeCreditService.getDemandeCreditById(id);
    }

    @PostMapping("/addDemandeCredit")
    public DemandeCredit addDemandeCredit(@RequestBody DemandeCredit demandeCredit) {
        return demandeCreditService.createDemandeCredit(demandeCredit);
    }

    @PatchMapping("/updateDemandeCredit/{id}")
    public DemandeCredit updateDemandeCredit(@PathVariable int id, @RequestBody DemandeCredit demandeCredit) {
        demandeCredit.setId(id);
        return demandeCreditService.updateDemandeCredit(demandeCredit);
    }

    @DeleteMapping("/deleteDemandeCredit/{id}")
    public void deleteDemandeCredit(@PathVariable int id) {
        demandeCreditService.deleteDemandeCreditById(id);
    }
}


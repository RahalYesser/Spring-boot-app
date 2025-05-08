package com.example.firstproject.services;

import com.example.firstproject.entities.Banque;
import com.example.firstproject.entities.DemandeCredit;
import com.example.firstproject.entities.Directeur;

import java.util.List;

public interface IDirecteurService {

    public List<Directeur> getAllDirecteurs();
    public Directeur getDirecteurById(int id);
    public Directeur createDirecteur(Directeur directeur);
    public Directeur updateDirecteur(Directeur directeur);
    //Directeur getDirecteurByAgenceNom(String nom);
    Directeur getDirecteurByBanqueNom(String nom);
    public void deleteDirecteurById(int id);

}

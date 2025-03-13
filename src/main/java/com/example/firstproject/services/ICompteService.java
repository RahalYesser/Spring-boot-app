package com.example.firstproject.services;

import com.example.firstproject.entities.Compte;

import java.util.List;
import java.util.Optional;

public interface ICompteService {

    public List<Compte> getAllComptes();
    public Compte getCompteById(int id);
    public Compte createCompte(Compte compte);
    public Compte updateCompte(Compte compte);
    public void deleteCompteById(int id);

}

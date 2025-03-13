package com.example.firstproject.services;
import com.example.firstproject.entities.Compte;
import com.example.firstproject.repositories.ICompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteService implements ICompteService {
    @Autowired
    ICompteRepository compteRepository;

    @Override
    public List<Compte> getAllComptes() {
        return (List<Compte>) compteRepository.findAll();
    }

    @Override
    public Compte getCompteById(int id) {
        return compteRepository.findById(id).orElse(null);
    }

    @Override
    public Compte createCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public void deleteCompteById(int id) {
        compteRepository.deleteById(id);
    }
}

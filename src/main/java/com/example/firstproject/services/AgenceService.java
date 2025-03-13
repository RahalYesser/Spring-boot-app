package com.example.firstproject.services;
import com.example.firstproject.entities.Agence;
import com.example.firstproject.repositories.IAgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceService implements IAgenceService {
    @Autowired
    IAgenceRepository agenceRepository;

    @Override
    public List<Agence> getAllAgences() {
        return (List<Agence>) agenceRepository.findAll();
    }

    @Override
    public Agence getAgenceById(int id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence createAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(int id) {
        agenceRepository.deleteById(id);
    }
}

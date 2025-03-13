package com.example.firstproject.services;

import com.example.firstproject.entities.Agence;

import java.util.List;

public interface IAgenceService {

    public List<Agence> getAllAgences();
    public Agence getAgenceById(int id);
    public Agence createAgence(Agence agence);
    public Agence updateAgence(Agence agence);
    public void deleteAgence(int id);
}

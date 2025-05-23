package com.example.firstproject.services;

import com.example.firstproject.entities.Banque;
import com.example.firstproject.entities.Compte;

import java.util.List;
import java.util.Optional;

public interface IBanqueService {

    public List<Banque> getAllBanques();
    public Banque getBanqueById(int id);
    public Banque createBanque(Banque banque);
    public Banque updateBanque(Banque banque);
    public void deleteBanque(int id);
    Banque affecterBanqueAgence(int idb, int ida);

}

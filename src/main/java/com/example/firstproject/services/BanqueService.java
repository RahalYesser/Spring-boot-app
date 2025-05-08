package com.example.firstproject.services;
import com.example.firstproject.entities.Agence;
import com.example.firstproject.entities.Banque;
import com.example.firstproject.repositories.IAgenceRepository;
import com.example.firstproject.repositories.IBanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanqueService implements IBanqueService {
    @Autowired
    private IBanqueRepository banqueRepository;
    @Autowired
    private IAgenceRepository agenceRepository;

    @Override
    public List<Banque> getAllBanques() {
        return (List<Banque>) banqueRepository.findAll();
    }

    @Override
    public Banque getBanqueById(int id) {
        return banqueRepository.findById(id).orElse(null);
    }

    @Override
    public Banque createBanque(Banque banque) {
        return banqueRepository.save(banque);
    }

    @Override
    public Banque updateBanque(Banque banque) {
        return banqueRepository.save(banque);
    }

    @Override
    public void deleteBanque(int id) {
        banqueRepository.deleteById(id);
    }

    @Override
    public Banque affecterBanqueAgence(int idb, int ida){
        Banque banque = banqueRepository.findById(idb).orElse(null);
        Agence agence = agenceRepository.findById(ida).orElse(null);

        if(banque != null && agence != null){
            banque.getAgences().add(agence);
            return banqueRepository.save(banque);
        }
        return null;
    }
}

package com.example.firstproject.services;
import com.example.firstproject.entities.Compte;
import com.example.firstproject.entities.Client;
import com.example.firstproject.repositories.IClientRepository;
import com.example.firstproject.repositories.ICompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CompteService implements ICompteService {
    @Autowired
    ICompteRepository compteRepository;
    @Autowired
    IClientRepository clientRepository ;

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

    @Override
    public Compte affecterCompteClient(int idcp, int idcl) {
        Compte compte = compteRepository.findById(idcp).orElse(null);
        Client client = clientRepository.findById(idcl).orElse(null);

        if (compte != null && client != null) {
            compte.setClient(client);
            return compteRepository.save(compte);
        }
        return null;
    }

    /*@Override
    public Compte ajouterEtAffecterClientCompte(Client client) {
        //Client savedClient = clientRepository.save(client);
        List<Compte> comptes = client.getComptes();
        for (Compte compte : comptes) {
            Client savedClient = clientRepository.save(client);
            compte.setClient(client);
            Compte nvcompte = compteRepository.save(compte);
        }
        return nvcompte;
    }*/


}

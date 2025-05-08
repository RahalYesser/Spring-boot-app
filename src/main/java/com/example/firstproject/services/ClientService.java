package com.example.firstproject.services;

import com.example.firstproject.entities.Agence;
import com.example.firstproject.entities.Client;
import com.example.firstproject.entities.Compte;
import com.example.firstproject.repositories.IAgenceRepository;
import com.example.firstproject.repositories.IClientRepository;
import com.example.firstproject.repositories.ICompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    IClientRepository clientRepository;
    @Autowired
    IAgenceRepository agenceRepository;
    @Autowired
    private ICompteRepository compteRepository;

    @Override
    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }
    @Override
    public Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client affecterClientAgence(Client client, int ida) {
        Agence agence = agenceRepository.findById(ida).orElse(null);
        if (agence != null && client != null) {
            client.setAgence(agence);
            return clientRepository.save(client);
        }
        return null;
    }

    @Override
    public Client ajouterEtAffecterClientCompte(Client client) {
        List<Compte> comptes = client.getComptes();
        if(comptes!=null) {
            for (Compte compte : comptes) {
                compte.setClient(client);
                compteRepository.save(compte);
            }
        }

        return client;
    }
}


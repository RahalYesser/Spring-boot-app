package com.example.firstproject.services;

import com.example.firstproject.entities.Client;

import java.util.List;

public interface IClientService {

    public List<Client> getAllClients();
    public Client getClientById(int id);
    public Client createClient(Client client);
    public Client updateClient(Client client);
    public void deleteClient(int id);
}

package com.example.firstproject.controllers;

import com.example.firstproject.entities.Client;
import com.example.firstproject.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    IClientService clientService;

    @GetMapping
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PatchMapping("/updateClient/{id}")
    public Client updateClient(@PathVariable int id, @RequestBody Client client) {
        client.setId(id);
        return clientService.updateClient(client);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }
}


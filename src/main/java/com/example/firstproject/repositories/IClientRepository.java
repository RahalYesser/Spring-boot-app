package com.example.firstproject.repositories;

import com.example.firstproject.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends CrudRepository<Client, Integer> {
}

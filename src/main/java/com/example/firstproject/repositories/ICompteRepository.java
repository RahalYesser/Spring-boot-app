package com.example.firstproject.repositories;

import com.example.firstproject.entities.Compte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompteRepository extends CrudRepository<Compte, Integer> {
}

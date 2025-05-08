package com.example.firstproject.repositories;

import com.example.firstproject.entities.Directeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IDirecteurRepository extends CrudRepository<Directeur, Integer> {
    //Directeur findByAgenceNom(String nom);
    Optional<Directeur> findByBanqueNom(String nom);
}

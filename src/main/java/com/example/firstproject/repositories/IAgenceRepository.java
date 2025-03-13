package com.example.firstproject.repositories;

import com.example.firstproject.entities.Agence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAgenceRepository extends CrudRepository<Agence, Integer> {
}

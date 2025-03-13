package com.example.firstproject.repositories;

import com.example.firstproject.entities.Banque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBanqueRepository extends CrudRepository<Banque, Integer> {
}

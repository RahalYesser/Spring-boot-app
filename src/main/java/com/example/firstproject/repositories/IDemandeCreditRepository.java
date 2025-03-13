package com.example.firstproject.repositories;

import com.example.firstproject.entities.DemandeCredit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDemandeCreditRepository extends CrudRepository<DemandeCredit, Integer> {
}

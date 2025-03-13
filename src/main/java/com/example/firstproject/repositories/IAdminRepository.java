package com.example.firstproject.repositories;

import com.example.firstproject.entities.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends CrudRepository<Admin, Integer> {
}

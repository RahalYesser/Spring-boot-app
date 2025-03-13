package com.example.firstproject.services;
import com.example.firstproject.entities.Admin;
import com.example.firstproject.repositories.IAdminRepository;
import com.example.firstproject.repositories.IAgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements IAdminService {
    @Autowired
    IAdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmins() {
        return (List<Admin>) adminRepository.findAll();
    }

    @Override
    public Admin getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}

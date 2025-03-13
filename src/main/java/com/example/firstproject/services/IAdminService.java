package com.example.firstproject.services;

import com.example.firstproject.entities.Admin;

import java.util.List;

public interface IAdminService {

    public List<Admin> getAllAdmins();
    public Admin getAdminById(int id);
    public Admin createAdmin(Admin admin);
    public Admin updateAdmin(Admin admin);
    public void deleteAdmin(int id);
}

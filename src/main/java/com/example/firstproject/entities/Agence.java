package com.example.firstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;
    /*@ManyToOne
    private Banque banque;*/
    @OneToMany(mappedBy = "agence")
    private List<Admin> admins;
    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    private List<Client> clients;

}

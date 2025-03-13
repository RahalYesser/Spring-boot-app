package com.example.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaiss;
    private String matricule;
    @ManyToOne
    private Agence agence;
    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;
    @OneToMany(mappedBy = "client")
    private List<DemandeCredit> demandesCredit;
}

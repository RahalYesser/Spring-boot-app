package com.example.firstproject.services;

import com.example.firstproject.entities.DemandeCredit;

import java.util.List;

public interface IDemandeCreditService {

    public List<DemandeCredit> getAllDemandeCredit();
    public DemandeCredit getDemandeCreditById(int id);
    public DemandeCredit createDemandeCredit(DemandeCredit demandecredit);
    public DemandeCredit updateDemandeCredit(DemandeCredit demandecredit);
    public void deleteDemandeCreditById(int id);

}



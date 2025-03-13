package com.example.firstproject.services;

import com.example.firstproject.entities.DemandeCredit;
import com.example.firstproject.repositories.IDemandeCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeCreditService implements IDemandeCreditService {

    @Autowired
    IDemandeCreditRepository demandecreditRepository;

    @Override
    public List<DemandeCredit> getAllDemandeCredit() {
        return (List<DemandeCredit>) demandecreditRepository.findAll();
    }

    @Override
    public DemandeCredit getDemandeCreditById(int id) {
        return demandecreditRepository.findById(id).orElse(null);
    }

    @Override
    public DemandeCredit createDemandeCredit(DemandeCredit demandecredit) {
        return demandecreditRepository.save(demandecredit);
    }

    @Override
    public DemandeCredit updateDemandeCredit(DemandeCredit demandecredit) {
        return demandecreditRepository.save(demandecredit);
    }

    @Override
    public void deleteDemandeCreditById(int id) {
        demandecreditRepository.deleteById(id);
    }
}

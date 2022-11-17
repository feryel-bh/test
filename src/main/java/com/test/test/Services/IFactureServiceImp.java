package com.test.test.Services;

import com.test.test.Entities.Client;
import com.test.test.Entities.Facture;
import com.test.test.Repositories.ClientRepository;
import com.test.test.Repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFactureServiceImp implements IFactureService{
    @Autowired
    FactureRepository factureRepository;
    @Autowired
    ClientRepository clientRepository;


    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
       Facture fa = factureRepository.findById(id).orElse(null);
       if(fa.getActive()!=Boolean.TRUE){
           fa.setActive(Boolean.TRUE);
       }
  }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        /*Client c = clientRepository.findById(idClient).orElse(null);
        if(c!=null)
        {
            c.getFactures();
        }
        return null;*/
        return factureRepository.findByClientIdClient(idClient);
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {

        return null;
    }
}

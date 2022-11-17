package com.test.test.Services;

import com.test.test.Entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

    public List<Fournisseur> retrieveAllFournisseurs();
    public Fournisseur retrieveFournisseur (Long id);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}

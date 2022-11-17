package com.test.test.Services;

import com.test.test.Entities.Fournisseur;
import com.test.test.Entities.Produit;
import com.test.test.Repositories.FournisseurRepository;
import com.test.test.Repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IFournisseurServiceImp implements IFournisseurService{
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
       Fournisseur f = fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit p = produitRepository.findById(produitId).orElse(null);

        if((f!=null)&&(p != null))
        {
            List<Fournisseur> fournisseurs = new ArrayList<>();
            List<Produit> produits= f.getProduits();
            produits.add(p);
            p.setFournisseur(fournisseurs);

         }
    }


}

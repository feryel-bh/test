package com.test.test.Services;

import com.test.test.Entities.Produit;

import java.util.List;

public interface IProduitService {

    public List<Produit> retrieveAllProduits();

    public Produit addProduit(Produit p, Long idRayon, Long idStock);

    public Produit retrieveProduit(Long id);
    public void assignProduitToStock(Long idProduit, Long idStock);

}

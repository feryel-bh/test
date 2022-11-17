package com.test.test.Services;

import com.test.test.Entities.Facture;

import java.util.List;

public interface IFactureService {

   public List<Facture> retrieveAllFactures();
    public void cancelFacture(Long id);
    public Facture retrieveFacture(Long id);
    public List<Facture> getFacturesByClient(Long idClient);
    public Facture addFacture(Facture f, Long idClient);
}

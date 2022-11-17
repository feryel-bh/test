package com.test.test.Services;

import com.test.test.Entities.DetailProduit;
import com.test.test.Entities.Produit;
import com.test.test.Entities.Rayon;
import com.test.test.Entities.Stock;
import com.test.test.Repositories.DetailProduitRepository;
import com.test.test.Repositories.ProduitRepository;
import com.test.test.Repositories.RayonRepository;
import com.test.test.Repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProduitServiceImp implements IProduitService{
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    StockRepository stockRepository;
    @Autowired
    RayonRepository rayonRepository;
    @Autowired
    DetailProduitRepository detailProduitRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll() ;
    }

 @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon r = rayonRepository.findById(idRayon).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setRayon(r);
        p.setStock(stock);
     if(p.getDetailProduit()!=null)
     {
         DetailProduit dp = p.getDetailProduit();
         detailProduitRepository.save(dp);}
        return produitRepository.save(p);
    }


    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
     Produit p = produitRepository.findById(idProduit).orElse(null);
        Stock s = stockRepository.findById(idStock).orElse(null);

        if((p!=null)&&(s != null))
        {

              s.getProduits().add(p);
             produitRepository.save(p);

        }

    }
}

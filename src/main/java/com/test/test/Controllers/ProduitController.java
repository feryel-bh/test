package com.test.test.Controllers;

import com.test.test.Entities.Produit;
import com.test.test.Services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    IProduitService Ps;

    @GetMapping("/afficherp")
    public List<Produit> retrieveAllProduits(){ return Ps.retrieveAllProduits();}
    @PostMapping("/addP")
    public Produit addProduit(@RequestBody Produit p, @RequestBody Long idRayon,@RequestBody Long idStock){return  Ps.addProduit(p,idRayon,idStock);}
    @GetMapping("/affiche/{id}")
    public Produit retrieveProduit(@PathVariable("id") Long id){return Ps.retrieveProduit(id);}
   @PostMapping("/addandassign/{idp}/{ids}")
   public void assignProduitToStock(@PathVariable("idp")  Long idProduit,@PathVariable("ids")  Long idStock)
   {
    Ps.assignProduitToStock(idProduit,idStock);
   }
}

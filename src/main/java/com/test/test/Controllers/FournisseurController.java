package com.test.test.Controllers;


import com.test.test.Entities.Fournisseur;
import com.test.test.Services.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    @Autowired
    IFournisseurService iFournisseurService;

    @GetMapping("/fournisseur")
   public List<Fournisseur> retrieveAllFournisseurs(){return iFournisseurService.retrieveAllFournisseurs();}

    @GetMapping("/delete/{id}")
    public Fournisseur retrieveFournisseur (@PathVariable("id") Long id){ return iFournisseurService.retrieveFournisseur(id);}

    @PostMapping("/addfourtoprod/{idf}/{idp}")
    public void assignFournisseurToProduit(@PathVariable("idf")Long fournisseurId,@PathVariable("idp") Long produitId)
    {
        iFournisseurService.assignFournisseurToProduit(fournisseurId,produitId);
    }
}

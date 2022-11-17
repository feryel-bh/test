package com.test.test.Controllers;

import com.test.test.Entities.Facture;
import com.test.test.Services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    IFactureService fs;

    @GetMapping("/facture")
    public List<Facture> retrieveAllFactures() {
        return fs.retrieveAllFactures();
    }
    @DeleteMapping("/Delete/{id}")
    public void cancelFacture(@PathVariable("id") Long id) { fs.cancelFacture(id);}
    @GetMapping("/facture/{id}")
    public Facture retrieveFacture(@PathVariable("id") Long id) {return  fs.retrieveFacture(id);}
    @PostMapping("/facturesbyclient/{idc}")
    public List<Facture> getFacturesByClient(@PathVariable("idc") Long idClient)
    {
       return fs.getFacturesByClient(idClient);
    }
}


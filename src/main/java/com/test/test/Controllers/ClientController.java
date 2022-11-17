package com.test.test.Controllers;

import com.test.test.Entities.Client;
import com.test.test.Services.IClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientController {
    IClientService cs;

    @GetMapping("/affichec")
    public List<Client> retrieveAllClients(){ return cs.retrieveAllClients();}
    @PostMapping("/addc")
    public Client addClient(@RequestBody Client c){ return cs.addClient(c);}
    @DeleteMapping("/supprimer/{id}")
    public void deleteClient(@PathVariable Long id){ cs.deleteClient(id);}
    @PutMapping("/update")
    public Client updateClient(@RequestBody Client c){return cs.updateClient(c);}
    @GetMapping("/affi/{id}")
    public Client retrieveClient(@PathVariable Long id){return cs.retrieveClient(id);}

}

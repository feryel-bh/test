package com.test.test.Services;

import com.test.test.Entities.Client;
import com.test.test.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClientServiceImp implements IClientService {
    @Autowired
    ClientRepository cr;
    @Override
    public List<Client> retrieveAllClients() {
        return cr.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return cr.save(c);
    }

    @Override
    public void deleteClient(Long id) {
     cr.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return cr.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return cr.findById(id).orElse(null);
    }
}

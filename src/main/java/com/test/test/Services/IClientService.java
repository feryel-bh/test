package com.test.test.Services;

import com.test.test.Entities.Client;

import java.util.List;

public interface IClientService {

   public List<Client> retrieveAllClients();
   public Client addClient(Client c);
   public void deleteClient(Long id);
   public Client updateClient(Client c);
   public Client retrieveClient(Long id);
}

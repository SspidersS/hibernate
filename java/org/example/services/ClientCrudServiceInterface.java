package org.example.services;

import org.example.entities.Client;
import java.util.List;

public interface ClientCrudServiceInterface {
    void createClient(Client client);
    Client getClientById(Long id);
    List<Client> getAllClients();
    void updateClient(Client client);
    void deleteClient(Long id);
}

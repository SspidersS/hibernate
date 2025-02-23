package org.example.dao;

import org.example.entities.Client;
import java.util.List;

public interface ClientDao {
    void save(Client client);
    Client getById(Long id);
    List<Client> getAll();
    void update(Client client);
    void delete(Long id);
}

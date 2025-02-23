package org.example.services;
import jakarta.persistence.*;
import org.example.dao.ClientDao;
import org.example.dao.ClientDaoImpl;
import org.example.entities.Client;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class ClientCrudService implements ClientCrudServiceInterface {
    private final ClientDao clientDao = new ClientDaoImpl();

    @Override
    public void createClient(Client client) {
        clientDao.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientDao.getById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientDao.getAll();
    }

    @Override
    public void updateClient(Client client) {
        clientDao.update(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientDao.delete(id);
    }
}
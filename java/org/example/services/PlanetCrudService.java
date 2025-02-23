package org.example.services;

import org.example.dao.PlanetDao;
import org.example.dao.PlanetDaoImpl;
import org.example.entities.Planet;

import jakarta.persistence.*;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class PlanetCrudService implements PlanetCrudServiceInterface {

    private final PlanetDao planetDao = new PlanetDaoImpl();

    @Override
    public void createPlanet(Planet planet) {
        planetDao.save(planet);
    }

    @Override
    public Planet getPlanetById(String id) {
        return planetDao.getById(id);
    }

    @Override
    public List<Planet> getAllPlanets() {
        return planetDao.getAll();
    }

    @Override
    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }

    @Override
    public void deletePlanet(String id) {
        planetDao.delete(id);
    }
}

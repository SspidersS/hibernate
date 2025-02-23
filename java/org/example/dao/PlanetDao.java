package org.example.dao;

import org.example.entities.Planet;
import java.util.List;

public interface PlanetDao {
    void save(Planet planet);
    Planet getById(String id);
    List<Planet> getAll();
    void update(Planet planet);
    void delete(String id);
}

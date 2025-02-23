package org.example.services;

import org.example.entities.Planet;
import java.util.List;

public interface PlanetCrudServiceInterface {
    void createPlanet(Planet planet);
    Planet getPlanetById(String id);
    List<Planet> getAllPlanets();
    void updatePlanet(Planet planet);
    void deletePlanet(String id);
}

package org.example;

import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.services.ClientCrudService;
import org.example.services.PlanetCrudService;
import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();

        Client client = new Client("John Doe");
        clientService.createClient(client);
        System.out.println("Client saved: " + client.getId());

        Planet planet = new Planet("MARS", "Mars");
        planetService.createPlanet(planet);
        System.out.println("Planet saved: " + planet.getId());

        Client fetchedClient = clientService.getClientById(client.getId());
        if (fetchedClient != null) {
            System.out.println("Fetched Client: " + fetchedClient.getName());
            fetchedClient.setName("Jane Doe");
            clientService.updateClient(fetchedClient);
            System.out.println("Client updated: " + fetchedClient.getName());
        }

        clientService.deleteClient(client.getId());
        System.out.println("Client deleted");
    }
    }


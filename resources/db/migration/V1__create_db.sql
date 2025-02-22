CREATE TABLE client (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(200) NOT NULL CHECK (LENGTH(name) BETWEEN 3 AND 200)
);

CREATE TABLE planet (
                        id VARCHAR(10) PRIMARY KEY CHECK (id ~ '^[A-Z0-9]+$'),
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) BETWEEN 1 AND 500)
);

CREATE TABLE ticket (
                        id SERIAL PRIMARY KEY,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        client_id INT NOT NULL,
                        from_planet_id VARCHAR(10) NOT NULL,
                        to_planet_id VARCHAR(10) NOT NULL,
                        CONSTRAINT fk_client FOREIGN KEY (client_id) REFERENCES client(id) ON DELETE CASCADE,
                        CONSTRAINT fk_from_planet FOREIGN KEY (from_planet_id) REFERENCES planet(id),
                        CONSTRAINT fk_to_planet FOREIGN KEY (to_planet_id) REFERENCES planet(id)
);

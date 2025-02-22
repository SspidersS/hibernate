INSERT INTO client (name) VALUES
                              ('Alice Johnson'), ('Bob Smith'), ('Charlie Brown'), ('David White'), ('Eve Black'),
                              ('Frank Green'), ('Grace Miller'), ('Hank Adams'), ('Ivy Wilson'), ('Jack Lee');

INSERT INTO planet (id, name) VALUES
                                  ('MARS', 'Mars'), ('VEN', 'Venus'), ('EARTH', 'Earth'), ('JUP', 'Jupiter'), ('SAT', 'Saturn');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
                                                                 (1, 'EARTH', 'MARS'), (2, 'MARS', 'VEN'), (3, 'VEN', 'EARTH'), (4, 'EARTH', 'JUP'),
                                                                 (5, 'JUP', 'SAT'), (6, 'SAT', 'EARTH'), (7, 'EARTH', 'VEN'), (8, 'VEN', 'JUP'),
                                                                 (9, 'JUP', 'MARS'), (10, 'MARS', 'SAT');

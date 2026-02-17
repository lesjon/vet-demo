INSERT INTO household (id, address) VALUES (1, 'somestreet');
INSERT INTO household (id, address) VALUES (2, 'otherstreet');

INSERT INTO pet (id, household_id, name) VALUES (1, 1, 'Ramses');
INSERT INTO pet (id, household_id, name) VALUES (2, 2, 'Joey');
INSERT INTO pet (id, household_id, name) VALUES (3, 1, 'Poekie');
INSERT INTO pet (id, household_id, name) VALUES (4, 2, 'Mosi');
INSERT INTO pet (id, household_id, name) VALUES (5, 1, 'Sipi');

INSERT INTO owner (id, household_id, name) VALUES (1, 1, 'Tom Poezen');
INSERT INTO owner (id, household_id, name) VALUES (2, 1, 'Leo');
INSERT INTO owner (id, household_id, name) VALUES (3, 2, 'Steve');
INSERT INTO owner (id, household_id, name) VALUES (4, 2, 'Bill');


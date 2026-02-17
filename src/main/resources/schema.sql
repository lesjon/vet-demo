CREATE TABLE household
(
    id      BIGINT,
    address CHARACTER VARYING,
    PRIMARY KEY (id)
);

CREATE TABLE pet
(
    id           BIGINT,
    name         CHARACTER VARYING,
    household_id BIGINT,
    FOREIGN KEY (household_id) REFERENCES household,
    PRIMARY KEY (id)
);

CREATE TABLE owner
(
    id           BIGINT,
    name         CHARACTER VARYING,
    household_id BIGINT,
    FOREIGN KEY (household_id) REFERENCES household,
    PRIMARY KEY (id)
);


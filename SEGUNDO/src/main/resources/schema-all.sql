DROP TABLE people_segundo IF EXISTS;

CREATE TABLE people_segundo  (
    --person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    person_id BIGINT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    serial VARCHAR(20),
    failCount VARCHAR(3)
);

-- --- !Ups
CREATE TABLE segmento (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    numero VARCHAR(255),
    longitud DOUBLE PRECISION,
    direccion VARCHAR(255)
);

CREATE TABLE calzada (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    segmento_id BIGINT,
    tipo VARCHAR(255),
    longitud DOUBLE PRECISION,
    FOREIGN KEY (segmento_id) REFERENCES segmento(id)
);

CREATE TABLE bordillo (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    segmento_id BIGINT,
    tipo VARCHAR(255),
    longitud DOUBLE PRECISION,
    FOREIGN KEY (segmento_id) REFERENCES segmento(id)
);



CREATE TABLE topicos (
                        id BIGINT NOT NULL AUTO_INCREMENT,
                         titulo VARCHAR(100) NOT NULL,
                         mensaje VARCHAR(500) NOT NULL,
                         fecha_creacion VARCHAR(100) NOT NULL,
                         autor_id BIGINT,
                         estado BOOLEAN,
                         curso VARCHAR(100),
                         PRIMARY KEY (id),
                         FOREIGN KEY (autor_id) REFERENCES autores(id)
);

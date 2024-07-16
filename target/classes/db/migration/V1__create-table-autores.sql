CREATE TABLE autores (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         nombre VARCHAR(100) NOT NULL,
                         correo VARCHAR(100) NOT NULL unique,
                         clave VARCHAR(255) NOT NULL,
                         PRIMARY KEY (id)
);

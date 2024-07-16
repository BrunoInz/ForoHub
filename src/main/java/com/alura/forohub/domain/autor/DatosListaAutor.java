package com.alura.forohub.domain.autor;

public record DatosListaAutor(
        Long id,
        String nombre,
        String email
) {

    public DatosListaAutor (Autor autor) {
        this(autor.getId(), autor.getNombre(), autor.getCorreo());
    }

}

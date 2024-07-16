package com.alura.forohub.domain.autor;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarAutor(
        @NotNull
        Long id,
        String nombre
) {
}

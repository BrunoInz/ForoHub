package com.alura.forohub.domain.autor;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroAutor(
        @NotBlank
        String nombre,
        @NotBlank
        String correo,
        @NotBlank
        String clave
) {

}

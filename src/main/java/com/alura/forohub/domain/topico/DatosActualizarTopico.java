package com.alura.forohub.domain.topico;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        Boolean estado,
        String curso
) {
}

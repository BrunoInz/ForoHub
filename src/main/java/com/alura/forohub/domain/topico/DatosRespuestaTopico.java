package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.autor.DatosRespuestaAutor;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String estado,
        String curso,
        DatosRespuestaAutor autor
) {

    public DatosRespuestaTopico (Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getEstado() ? "Abierto" : "Cerrado",
                topico.getCurso(),
                new DatosRespuestaAutor(topico.getAutor())
        );

    }

}

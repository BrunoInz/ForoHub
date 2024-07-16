package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.autor.Autor;
import com.alura.forohub.domain.autor.DatosRegistroAutor;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "Topico")
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private Boolean estado;
    private String curso;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Topico(DatosRegistroTopico datosRegistroTopico, Autor autor) {
        Date fechaActual = new Date();
        String fechaString = fechaActual.toString();

        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = fechaString;
        this.estado = true; //true = abierto, false = cerrado
        this.curso = datosRegistroTopico.curso();
        this.autor = autor;
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.estado() != null) {
            this.estado = datosActualizarTopico.estado();
        }
        if (datosActualizarTopico.curso() != null) {
            this.curso = datosActualizarTopico.curso();
        }
    }
}

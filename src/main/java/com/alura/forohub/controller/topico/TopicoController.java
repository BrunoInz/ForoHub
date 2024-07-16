package com.alura.forohub.controller.topico;

import com.alura.forohub.domain.autor.Autor;
import com.alura.forohub.domain.autor.AutorRepository;
import com.alura.forohub.domain.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    TopicoRepository topicoRepository;
    @Autowired
    AutorRepository autorRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> crearTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico, UriComponentsBuilder uriComponentsBuilder){
        Autor autor = autorRepository.getReferenceById(datosRegistroTopico.idAutor());
        Topico topico = topicoRepository.save(new Topico(datosRegistroTopico, autor));
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(new DatosRespuestaTopico(topico));
    }

    @GetMapping
    public ResponseEntity<Page<DatosRespuestaTopico>> listarTopicos(@PageableDefault(size = 5) Pageable pageable){

        return ResponseEntity.ok(topicoRepository.findAll(pageable).map(DatosRespuestaTopico::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> buscarTopicoId(@PathVariable long id){
        Topico topico = topicoRepository.getReferenceById(id);

        return ResponseEntity.ok(new DatosRespuestaTopico(topico));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DatosRespuestaTopico> actualizarTopico(@PathVariable long id ,@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Optional<Topico> topicoActualizar = topicoRepository.findById(id);

        if (topicoActualizar.isPresent()){
            Topico topico = topicoActualizar.get();
            topico.actualizarDatos(datosActualizarTopico);
            return ResponseEntity.ok(new DatosRespuestaTopico(topico));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTopico(@PathVariable long id){
        Optional<Topico> topicoEliminar = topicoRepository.findById(id);
        if (topicoEliminar.isPresent()){
            topicoRepository.deleteById(topicoEliminar.get().getId());
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}

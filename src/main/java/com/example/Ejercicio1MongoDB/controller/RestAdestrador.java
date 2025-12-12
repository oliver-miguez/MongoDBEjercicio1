package com.example.Ejercicio1MongoDB.controller;

import com.example.Ejercicio1MongoDB.model.Adestrador;
import com.example.Ejercicio1MongoDB.model.Pokemon;
import com.example.Ejercicio1MongoDB.service.AdestradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestAdestrador.MAPPING)
public class RestAdestrador {

    public static final String MAPPING = "/mongodb/adestrador";

    @Autowired
    private AdestradorService adestradorService;

    @PostMapping("/gardar")
    public ResponseEntity<Adestrador> gardar(@RequestBody Adestrador adestrador) {
        adestradorService.crearAdestrador(adestrador);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Adestrador>> listarColeccion() {
        List <Adestrador> alumnos = adestradorService.buscarAdestrador();
        return new ResponseEntity<>(alumnos,HttpStatus.OK);
    }


    @GetMapping("/getProfedeAlumno/{id}")
    public ResponseEntity<Pokemon> actualizarGrupo(@PathVariable String id) {
        Pokemon p = adestradorService.buscarAdestradorDePokemon(id);

        if (p == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }

}

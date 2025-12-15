package com.example.Ejercicio1MongoDB.controller;

import com.example.Ejercicio1MongoDB.model.Pokemon1;
import com.example.Ejercicio1MongoDB.service.Pokemon1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestPokemon1.MAPPING)
public class RestPokemon1 {

    public static final String MAPPING = "/mongodb/pokemon1";

    @Autowired
    private Pokemon1Service pokemon1Service;

    @PostMapping("/gardar")
    public ResponseEntity<Pokemon1> gardarDocumento(@RequestBody Pokemon1 pokemon1) {
        pokemon1Service.gardar(pokemon1);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Pokemon1>> listarColeccion() {
        List <Pokemon1> pokemon1 = pokemon1Service.listAll();
        return new ResponseEntity<>(pokemon1,HttpStatus.OK);
    }

    @DeleteMapping("/borrarTodos")
    public ResponseEntity<Pokemon1> borrarColeccion() {
        pokemon1Service.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Pokemon1> actualizarGrupo() {
        Pokemon1 pokemon1 = pokemon1Service.getVideoxogoOot();
        pokemon1Service.delete();
        pokemon1.setNome("Oot");
        pokemon1Service.getVideoxogoOot();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

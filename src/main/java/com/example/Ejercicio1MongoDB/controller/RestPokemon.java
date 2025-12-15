package com.example.Ejercicio1MongoDB.controller;


import com.example.Ejercicio1MongoDB.model.Pokemon;
import com.example.Ejercicio1MongoDB.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestPokemon.MAPPING)
public class RestPokemon {

    public static final String MAPPING = "/mongodb/pokemon";

    @Autowired
    private PokemonService pokemonService;

    @PostMapping("/gardar")
    public ResponseEntity<Pokemon> gardar(@RequestBody Pokemon pokemon) {
        pokemonService.crearPokemon(pokemon);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Pokemon>> listarColeccion() {
        List <Pokemon> pokemon = pokemonService.buscarPokemon();
        return new ResponseEntity<>(pokemon,HttpStatus.OK);
    }
}

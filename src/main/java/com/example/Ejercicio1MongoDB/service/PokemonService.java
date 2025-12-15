package com.example.Ejercicio1MongoDB.service;

import com.example.Ejercicio1MongoDB.model.Pokemon;
import com.example.Ejercicio1MongoDB.model.Pokemon1;
import com.example.Ejercicio1MongoDB.repository.PokemonRepository;
import org.springframework.asm.TypeReference;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class PokemonService {

    // Referencia a los dos repositories de cada uno de los models
    private final PokemonRepository pokemonRepository;

    // Constructor para iniciar el repository
    public PokemonService(PokemonRepository pokemonRepo){this.pokemonRepository = pokemonRepo;}

    public void crearPokemon(Pokemon poke){ pokemonRepository.save(poke);}
    public Pokemon buscarPokemon(String id){return pokemonRepository.findById(id).orElse(null);}
    public List<Pokemon> buscarPokemon(){
       List<Pokemon> a = pokemonRepository.findAll();
        return pokemonRepository.findAll();
    }



}

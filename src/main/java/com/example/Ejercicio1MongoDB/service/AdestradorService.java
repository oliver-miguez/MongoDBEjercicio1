package com.example.Ejercicio1MongoDB.service;

import com.example.Ejercicio1MongoDB.model.Adestrador;
import com.example.Ejercicio1MongoDB.model.Pokemon;
import com.example.Ejercicio1MongoDB.repository.AdestradorRepository;
import com.example.Ejercicio1MongoDB.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdestradorService {

    // Repositories necesarios
    // Utilizamos también el de pokemon para poder crear la relación entre Adestrador y Pokemon
    private final PokemonRepository pokemonRepository;
    private final AdestradorRepository adestradorRepository;

    // Constructor que inicializa los repositories
    public AdestradorService(PokemonRepository pokemonRepo, AdestradorRepository adestradorRepo){
        this.adestradorRepository = adestradorRepo;
        this.pokemonRepository = pokemonRepo;
    }

    public void crearAdestrador(Adestrador adestrador){ adestradorRepository.save(adestrador);}
    public Adestrador buscarAdestrador(String id){return adestradorRepository.findById(id).orElse(null);}
    public List<Adestrador> buscarAdestrador(){return adestradorRepository.findAll();}

    public Pokemon buscarAdestradorDePokemon(String idAdestrador){
         Adestrador adestrador = buscarAdestrador(idAdestrador);
         if(adestrador == null) return  null;

        return pokemonRepository.findById(adestrador.getId()).orElse(null);
    }

}

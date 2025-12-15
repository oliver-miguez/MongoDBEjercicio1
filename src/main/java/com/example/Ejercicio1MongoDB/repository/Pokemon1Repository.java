package com.example.Ejercicio1MongoDB.repository;

import com.example.Ejercicio1MongoDB.model.Pokemon1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Pokemon1Repository extends MongoRepository<Pokemon1, String> {
    Pokemon1 findByNamePokemon1(String nomPokemon1);
    void deleteByNamePokemon1(String nomPokemon1);
}
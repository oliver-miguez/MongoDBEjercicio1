package com.example.Ejercicio1MongoDB.repository;


import com.example.Ejercicio1MongoDB.model.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon,String> {
}

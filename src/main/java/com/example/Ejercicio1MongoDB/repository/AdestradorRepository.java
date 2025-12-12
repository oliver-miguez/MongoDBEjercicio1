package com.example.Ejercicio1MongoDB.repository;

import com.example.Ejercicio1MongoDB.model.Adestrador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdestradorRepository extends MongoRepository<Adestrador,String> {
}

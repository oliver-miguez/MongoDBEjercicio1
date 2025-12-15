package com.example.Ejercicio1MongoDB.service;
import com.example.Ejercicio1MongoDB.model.Pokemon1;
import com.example.Ejercicio1MongoDB.repository.Pokemon1Repository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class Pokemon1Service {

    @Autowired
    private Pokemon1Repository pokemon1Repository;

    private final ObjectMapper objectMapper;

    public Pokemon1Service(Pokemon1Repository pokemon1Repository, ObjectMapper objectMapper) {
        this.pokemon1Repository = pokemon1Repository;
        this.objectMapper = objectMapper;
    }

    public void gardar(Pokemon1 videoxogo) {
        pokemon1Repository.save(videoxogo);
    }

    public List<Pokemon1> listAll() {
        return pokemon1Repository.findAll();
    }

    public void deleteAll(){
        pokemon1Repository.deleteAll();
    }

    public void delete(){
        pokemon1Repository.deleteBynome("OoT");
    }

    public Pokemon1 getVideoxogoOot() {
        return pokemon1Repository.findBynome("OoT");
    }

    public void importarJSON(){
        try{
            InputStream inputStream = new ClassPathResource("Pokemons.json").getInputStream();
            List<Pokemon1> pokemon1 = objectMapper.readValue(
                    inputStream,
                    new TypeReference<List<Pokemon1>>() {}
            );
            pokemon1Repository.saveAll(pokemon1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

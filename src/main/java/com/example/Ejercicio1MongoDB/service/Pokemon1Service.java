package com.example.Ejercicio1MongoDB.service;
import com.example.Ejercicio1MongoDB.model.Pokemon1;
import com.example.Ejercicio1MongoDB.repository.Pokemon1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Pokemon1Service {

    @Autowired
    private Pokemon1Repository pokemon1Repository;

    @pokemon1Repository
    public Pokemon1Service(Pokemon1Repository pokemon1Repository) {
        this.pokemon1Repository = pokemon1Repository;
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
        pokemon1Repository.deleteByNamePokemon1("OoT");
    }

    public Pokemon1 getVideoxogoOot() {
        return pokemon1Repository.findByNamePokemon1("OoT");
    }

}

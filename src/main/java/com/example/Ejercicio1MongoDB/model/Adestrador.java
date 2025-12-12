package com.example.Ejercicio1MongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "adestrador")
public class Adestrador {

    @Id
    private String id;

    private String nome;
    private int edad;
    private String cidade;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

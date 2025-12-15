package com.example.Ejercicio1MongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "pokemon1")
public class Pokemon1 {

    @Id
    private String id;

    private String nome;
    private ArrayList<String> tipo;
    private int nivel;
    private ArrayList<String> habilidades;
    private Adestrador1 adestrador1;

    public Pokemon1(){}

    public Pokemon1(String id, String nome, ArrayList<String> tipo, int nivel, ArrayList<String> habilidades, Adestrador1 adestrador1) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.habilidades = habilidades;
        this.adestrador1 = adestrador1;
    }

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

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Adestrador1 getAdestrador1() {
    return adestrador1;
    }

    public void setAdestrador1(Adestrador1 adestrador1) {
    this.adestrador1 = adestrador1;
    }

    @Override
    public String toString() {
        return "Pokemon1{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", nivel=" + nivel +
                ", habilidades=" + habilidades +
                ", adestrador1=" + adestrador1 +
                '}';
    }
}



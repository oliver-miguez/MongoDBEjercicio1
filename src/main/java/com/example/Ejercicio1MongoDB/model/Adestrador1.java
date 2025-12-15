package com.example.Ejercicio1MongoDB.model;

public class Adestrador1 {

    private String nome;
    private int edad;
    private String cidade;

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

    @Override
    public String toString() {
        return "Adestrador1{" +
                "nome='" + nome + '\'' +
                ", edad=" + edad +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

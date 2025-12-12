package com.example.Ejercicio1MongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.boot.autoconfigure.SpringBootApplication
@ComponentScan({"com.example.Ejercicio1MongoDB"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
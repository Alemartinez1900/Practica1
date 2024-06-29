package com.Practica1.practica;

import com.Practica1.practica.Repositorio.ArbolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);
    }

    @Autowired
    private ArbolRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {

        /*
        Arbol arbol1 = new Arbol("01", "rutaImagen", "Cedro", "colgante", 5, "Árbol muy alto, no frutal");
        repositorio.save(arbol1);

        Arbol arbol2 = new Arbol("02", "rutaImagen", "Guachipelin", "colgante", 5, "Árbol bajo, no frutal");
        repositorio.save(arbol2);

        Arbol arbol3 = new Arbol("03", "rutaImagen", "Naranjo", "colgante", 5, "Árbol bajo, frutal");
        repositorio.save(arbol3);
         */
    }
}

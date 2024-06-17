package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import static java.util.Collection.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("MAtrix",2004);
        otraPelicula.evalua(6);
        Serie casaDragon = new Serie("LA casa del dragon",2022);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2003);
        peliculaDeBruno.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println("Nombre: "+item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getClasificacion()>3){
                //Pelicula pelicula = (Pelicula) item;
                System.out.println("Clasificacion: "+pelicula.getClasificacion());

            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas Ordenada: "+listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista por fecha: "+lista);

    }
}

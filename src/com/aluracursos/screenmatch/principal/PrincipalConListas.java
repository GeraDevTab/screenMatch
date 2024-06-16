package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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
            System.out.println(item.getNombre());
            if(item instanceof Pelicula){
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());

            }


        }
    }
}

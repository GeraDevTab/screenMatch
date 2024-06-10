package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.Pelicula;
import com.aluracursos.screenmatch.Serie;
import com.aluracursos.screenmatch.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Pelicula p){
        tiempoTotal += p.getDuracionEnMinutos();
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}

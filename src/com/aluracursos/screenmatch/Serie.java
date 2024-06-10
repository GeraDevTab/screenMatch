package com.aluracursos.screenmatch;

public class Serie extends Titulo{
    private int temporadas;
    private int epidosiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpidosiosPorTemporada() {
        return epidosiosPorTemporada;
    }

    public void setEpidosiosPorTemporada(int epidosiosPorTemporada) {
        this.epidosiosPorTemporada = epidosiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos(){
        return temporadas * epidosiosPorTemporada * minutosPorEpisodio;
    }
}

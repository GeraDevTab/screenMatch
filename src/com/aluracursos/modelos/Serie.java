package com.aluracursos.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epidosiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

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

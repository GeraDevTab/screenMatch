package com.aluracursos.screenmatch;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalDeLasEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duracion en minutos: "+duracionEnMinutos);

    }

    void evalua(double nota){
        sumaEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){

        return sumaEvaluaciones / totalDeLasEvaluaciones;
    }
}

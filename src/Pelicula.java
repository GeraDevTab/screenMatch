public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaEvaluaciones;
    int totalDeLasEvaluaciones;

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

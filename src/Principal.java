import com.aluracursos.screenmatch.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        //System.out.println(miPelicula.sumaEvaluaciones);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "MAtrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFichaTecnica();

        //para imprimir la direccion de memoria de un objeto en java
        System.out.println(miPelicula);
        System.out.println(otraPelicula);

    }
}

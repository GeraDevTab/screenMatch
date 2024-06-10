import com.aluracursos.screenmatch.Pelicula;
import com.aluracursos.screenmatch.Serie;

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

        //Pelicula otraPelicula = new Pelicula();
        //otraPelicula.nombre = "MAtrix";
        //otraPelicula.fechaDeLanzamiento = 1998;
        //otraPelicula.duracionEnMinutos = 180;

        //otraPelicula.muestraFichaTecnica();

        //para imprimir la direccion de memoria de un objeto en java
        System.out.println("Impresion del objeto: "+miPelicula);
        //System.out.println(otraPelicula);

        Serie casaDragon = new Serie();
        casaDragon.setNombre("LA casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpidosiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

    }
}

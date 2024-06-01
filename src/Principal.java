public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
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

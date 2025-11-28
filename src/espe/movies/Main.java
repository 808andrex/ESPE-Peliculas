package espe.movies;

import espe.movies.Contenidos.Peliculas;
import espe.movies.Plataforma.Plataforma;
import espe.movies.Plataforma.Usuario;
import espe.movies.Plataforma.util.ScannerUtils;


public class Main {
    public static final String VERSION = "1.0.0";
    public static final String NOMBRE_PLATAFORMA = "ESPE Movies \uD83C\uDFAC";
    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA+" v"+VERSION);

        String titulo = ScannerUtils.capturarTexto("Nombre de la pelicula");
        String genero = ScannerUtils.capturarTexto("Genero de la pelicula");
        double calificacion = ScannerUtils.capturarDecimal("Calificaciones de contenido");
        int duracion = ScannerUtils.capturarNumero("Duracion del contenido");


        Peliculas movie = new Peliculas(titulo,duracion,genero,calificacion);
        Peliculas movie2 = new Peliculas("EL origen",180,"Drama",4.8);
        plataforma.agregar(movie);
        plataforma.agregar(movie2);
        System.out.println("\nNumero de Pelicukas: "+plataforma.getContenido().size());
        plataforma.mostrarTitulos();

        plataforma.eliminar(movie);
        System.out.println("\nLista nueva");
        plataforma.mostrarTitulos();
//        System.out.println(movie.obtenerFichaTecnica());

//        long duracionLong = movie.duraciom;
//        System.out.println("Duracion long "+duracionLong);x
//        int calificacion = (int)movie.calificacion;
//        System.out.println("Calificacion int: "+calificacion);
//        long numeroDePremios = Long.parseLong("14");

        Usuario user = new Usuario("Kevin","808andrex@gmail.com");
//        user.ver(movie);

/*      Scanner scanner = new Scanner(System.in);
        System.out.print("Cual es tu nombre?: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola "+nombre+", esto es una prueba");
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tu edad es "+edad);*/
    }
}

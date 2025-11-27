package espe.movies.Plataforma.util;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);
    public static String capturarTexto(String mensage){
        System.out.print(mensage+": ");
        return  scanner.nextLine();
    }

    public static int capturarNumero(String mensaje){
        System.out.print(mensaje+": ");
        int dato = scanner.nextInt();
        scanner.nextLine();
        return dato;
    }

    public static double capturarDecimal(String mensaje){
        System.out.print(mensaje+": ");
        double dato = scanner.nextDouble();
        scanner.nextLine();
        return dato;
    }
}

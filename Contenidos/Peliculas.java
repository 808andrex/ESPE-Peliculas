package espe.movies.Contenidos;

import java.time.LocalDate;

public class Peliculas {
    public  String titulo;
    public  String descripcion;
    public  int duraciom;
    public  String genero;
    public LocalDate fechaEstreno;
    public  double calificacion;
    public  boolean disponible;

    public Peliculas(String titulo, int duraciom, String genero){
        this.titulo=titulo;
        this.duraciom=duraciom;
        this.genero=genero;
        this.disponible=true;
        this.fechaEstreno=LocalDate.now();
    }

    public Peliculas(String titulo, int duraciom, String genero,double calificacion) {
        this(titulo,duraciom,genero);
        this.calificar(calificacion);
    }

    public void reproducir(){
        System.out.println("Reproduciendo "+titulo);
    }

    public String obtenerFichaTecnica(){
        return titulo + "("+fechaEstreno.getYear()+")\n"+
                "Genero: "+genero+"\n"+
                "Calificacion: "+calificacion+"/5"+"\n";
    }

    public void calificar(double calificacion){
        if(calificacion>=0 && calificacion<=5){
            this.calificacion=calificacion;
        }
    }

    public boolean esPopular(){
        return calificacion>=4;
    }
}

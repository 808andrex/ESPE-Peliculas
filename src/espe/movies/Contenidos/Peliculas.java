package espe.movies.Contenidos;

import java.time.LocalDate;

public class Peliculas {
    private  String titulo;
    private  String descripcion;
    private  int duraciom;
    private  String genero;
    private LocalDate fechaEstreno;
    private  double calificacion;
    private  boolean disponible;

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

    /** GETTERS */
    public boolean esPopular(){
        return calificacion>=4;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuraciom() {
        return duraciom;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    /** SETTERS */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setDuraciom(int duraciom) {
        this.duraciom = duraciom;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package espe.movies.Plataforma;

import espe.movies.Contenidos.Peliculas;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    private List<Peliculas> contenido;

    public Plataforma(String nombre){
        this.nombre=nombre;
        this.contenido=new ArrayList<>();
    }

    public void agregar(Peliculas item){
        this.contenido.add(item);
    }

    public void mostrarTitulos(){
        for(Peliculas peliculas : contenido){
            System.out.println(peliculas.getTitulo());
        }
    }

    public void eliminar(Peliculas item){
        this.contenido.remove(item);
        System.out.println("Pelicula "+item.getTitulo()+" eliminada");
    }
    /** GETTERS */
    public String getNombre() {
        return nombre;
    }

    public List<Peliculas> getContenido() {
        return contenido;
    }
}

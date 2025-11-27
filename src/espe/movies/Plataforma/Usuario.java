package espe.movies.Plataforma;

import espe.movies.Contenidos.Peliculas;

import java.time.LocalDateTime;

public class Usuario {
    public String nombre;
    public String correo;
    public LocalDateTime fechaRegistro;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo=correo;
        this.fechaRegistro= LocalDateTime.now();
    }

    public void ver(Peliculas novie){
        System.out.println(nombre+ " esta viendo ...");
        novie.reproducir();
    }

}

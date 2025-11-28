package espe.movies.Plataforma;

import espe.movies.Contenidos.Peliculas;

import java.time.LocalDateTime;

public class Usuario {
    private String nombre;
    private String correo;
    private LocalDateTime fechaRegistro; //Agregaion

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo=correo;
        this.fechaRegistro= LocalDateTime.now();
    }

    public void ver(Peliculas novie){ //Asosiacion
        System.out.println(nombre+ " esta viendo ...");
        novie.reproducir();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
}

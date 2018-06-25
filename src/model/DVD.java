package model;

import controller.Controlador;
import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class DVD implements Serializable{
    private long ID;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Pelicula pelicula;

    public DVD(Pelicula pelicula) {
        Random r = new Random();
        this.ID = Controlador.totales + 1;
        this.fechaAlquiler = null;
        this.fechaDevolucion = null;
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
}

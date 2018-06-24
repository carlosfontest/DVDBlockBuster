package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class DVD implements Serializable{
    private int ID;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Pelicula pelicula;

    public DVD(Pelicula pelicula) {
        Random r = new Random();
        int num = r.nextInt(99999) + 1;
        this.ID = num;
        this.fechaAlquiler = null;
        this.fechaDevolucion = null;
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
}

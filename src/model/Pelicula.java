package model;

import controller.Controlador;
import java.io.Serializable;

public class Pelicula implements Serializable{
    private String titulo;
    private String genero;
    private String descripcion;
    private int precioDia;
    private int rating;
    private int stock;
    private long RRN;

    public Pelicula(String titulo, String genero, String descripcion, int precioDia, int rating) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.precioDia = precioDia;
        this.rating = rating;
    }

    public Pelicula(String titulo, long RRN) {
        this.titulo = titulo;
        this.RRN = RRN;
        this.genero = null;
        this.descripcion = null;
        this.precioDia = 0;
        this.rating = 0;
    }
    
    public Pelicula(long RRN, String genero) {
        this.genero = genero;
        this.RRN = RRN;
        this.titulo = null;
        this.descripcion = null;
        this.precioDia = 0;
        this.rating = 0;
    }
    
    
    

    public String getTitulo() {
        return titulo;
    }
    
    
    
    
    
    
    
}

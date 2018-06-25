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

    public String getTitulo() {
        return titulo;
    }
    
    
    
    
    
    
    
}

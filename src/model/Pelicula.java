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

    public Pelicula(String titulo, String genero, String descripcion, int precioDia, int rating) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.precioDia = precioDia;
        this.rating = rating;
    }
    
    public int getStock(){
        int cont = 0;
        
        for (int i = 0; i < Controlador.almacen.size(); i++) {
            if(this.titulo.equals(Controlador.almacen.get(i).getPelicula().getTitulo())){
                cont++;
            }
        }
        return cont;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    
    
    
    
    
}

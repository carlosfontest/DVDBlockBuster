package model;

public class Pelicula {
    private String titulo;
    private String genero;
    private String descripcion;
    private Double precioDia;
    private int rating;
    private int stock;

    public Pelicula(String titulo, String genero, String descripcion, Double precioDia, int rating, int stock) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.precioDia = precioDia;
        this.rating = rating;
        this.stock = stock;
    }
    
    
    
}

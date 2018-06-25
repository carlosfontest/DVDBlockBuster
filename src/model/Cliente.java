package model;

import java.io.Serializable;

public class Cliente implements Serializable{
    private long cedula;
    private String nombre;
    private String apellido;
    private DVD dvd;
    private long RRN;

    public Cliente(long cedula, String nombre, String apellido, long RRN) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.RRN = RRN;
        this.dvd = null;
    }

    public Cliente(long cedula, String nombre, String apellido, DVD dvd, long RRN) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dvd = dvd;
        this.RRN = RRN;
    }
    
    
    
    
    
}

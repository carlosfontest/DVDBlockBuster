package model;

import java.io.Serializable;

public class Cliente implements Serializable{
    private long cedula;
    private String nombre;
    private String apellido;
    private long ID;
    private long RRN;

    public Cliente(long cedula, String nombre, String apellido, long RRN) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.RRN = RRN;
        this.ID = 0;
    }

    public Cliente(long cedula, String nombre, String apellido, long ID, long RRN) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.RRN = RRN;
    }

    public Cliente(long RRN, long cedula) {
        this.cedula = cedula;
        this.RRN = RRN;
        this.nombre = null;
        this.apellido = null;
        this.ID = 0;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getID() {
        return ID;
    }

    public long getRRN() {
        return RRN;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
    
}

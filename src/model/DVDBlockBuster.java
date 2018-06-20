package model;

import controller.Controlador;

public class DVDBlockBuster {

    public DVDBlockBuster() {
        Controlador controlador = new Controlador();
        controlador.iniciarPrograma();
    }
    
    
    
    public static void main(String[] args) {
        DVDBlockBuster blockBuster = new DVDBlockBuster();
    }

}

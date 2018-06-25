package model;

import controller.Controlador;
import java.io.FileNotFoundException;

public class DVDBlockBuster {

    public DVDBlockBuster() throws FileNotFoundException {
        Controlador controlador = new Controlador();
        controlador.iniciarPrograma();
    }
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
        DVDBlockBuster blockBuster = new DVDBlockBuster();
    }

}

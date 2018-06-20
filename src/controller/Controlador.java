package controller;

import view.FramePrincipal;

public class Controlador {
    
    public void iniciarPrograma(){
        FramePrincipal principal = new FramePrincipal(this);
        principal.setVisible(true);
        
        
    }
    
}

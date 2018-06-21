package controller;

import javax.swing.JOptionPane;
import view.FramePrincipal;
import view.Loading;
import view.Login;

public class Controlador {
    
    public void iniciarPrograma(){
        FramePrincipal principal = new FramePrincipal(this);
        //Login principal = new Login(this);
        principal.setVisible(true);
    }
    
    public void iniciarSesion(Login inicio){
        // Validacion de usuario para acceder al sistema
        
        if(inicio.user.getText().trim().equals("admin") && inicio.pass.getText().equals("admin")){
            // Inicio frame Loading
            Loading loading = new Loading();
            
            Runnable miRunnable = new Runnable(){
            @Override
            public void run(){
                try
                {
                    // Si no hay ningun error carga el juego
                    inicio.dispose();
                    loading.setVisible(true);
                    for (int i = 0; i <= 100; i++) {
                        // Tiempo que tardará la carga
                        Thread.sleep(13);
                        loading.loadingBar.setValue(i);

                        if(i==100){
                            Thread.sleep(1000);
                        }
                    }
                    loading.dispose();
                    abrirPrincipal();
                }catch (InterruptedException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                }
            };
            Thread hilo = new Thread (miRunnable);
            hilo.start();
            
            // Fin frame loading
        }else{
            JOptionPane.showMessageDialog(inicio, "Usuario o contraseña inválidos");
            inicio.user.setText("User");
            inicio.pass.setText("password");
        }
    }
    
    public void abrirPrincipal(){
        // Abre la ventana del JFrame Principal
        FramePrincipal principal = new FramePrincipal(this);
        principal.setVisible(true);
    }
    
}

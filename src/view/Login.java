package view;

import controller.Controlador;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private Controlador controlador;
    int x,y;

    public Login(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/logoBlackBuster.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        panelGris = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        labelCopy = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        botonAux = new javax.swing.JToggleButton();
        panelRojoG = new javax.swing.JPanel();
        labelIniciarSesion = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        pass = new javax.swing.JPasswordField();
        separador2 = new javax.swing.JSeparator();
        iconoPass = new javax.swing.JLabel();
        iconoUser = new javax.swing.JLabel();
        botonAcceder = new javax.swing.JButton();
        iconoCerrar = new javax.swing.JLabel();
        iconoMinimizar = new javax.swing.JLabel();
        panelRojoP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGris.setBackground(new java.awt.Color(102, 102, 102));
        panelGris.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelGrisMouseDragged(evt);
            }
        });
        panelGris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelGrisMousePressed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBlackBuster.png"))); // NOI18N

        labelCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copyright.png"))); // NOI18N

        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portada.png"))); // NOI18N

        botonAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAuxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGrisLayout = new javax.swing.GroupLayout(panelGris);
        panelGris.setLayout(panelGrisLayout);
        panelGrisLayout.setHorizontalGroup(
            panelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrisLayout.createSequentialGroup()
                .addGroup(panelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGrisLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(logo))
                    .addGroup(panelGrisLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelNombre))
                    .addGroup(panelGrisLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGrisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGrisLayout.setVerticalGroup(
            panelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrisLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRojoG.setBackground(new java.awt.Color(70, 24, 30));

        labelIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iniciarSesion.png"))); // NOI18N

        user.setBackground(new java.awt.Color(70, 24, 30));
        user.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("User");
        user.setBorder(null);
        user.setSelectionColor(new java.awt.Color(102, 102, 102));
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        separador1.setBackground(new java.awt.Color(102, 102, 102));
        separador1.setForeground(new java.awt.Color(102, 102, 102));

        pass.setBackground(new java.awt.Color(70, 24, 30));
        pass.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("password");
        pass.setBorder(null);
        pass.setSelectionColor(new java.awt.Color(102, 102, 102));
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        separador2.setBackground(new java.awt.Color(102, 102, 102));
        separador2.setForeground(new java.awt.Color(102, 102, 102));

        iconoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N

        iconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        botonAcceder.setBackground(new java.awt.Color(102, 102, 102));
        botonAcceder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAcceder.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder.setText("Acceder");
        botonAcceder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonAcceder.setFocusPainted(false);
        botonAcceder.setFocusable(false);
        botonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccederActionPerformed(evt);
            }
        });

        iconoCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        iconoCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoCerrarMouseClicked(evt);
            }
        });

        iconoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        iconoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRojoGLayout = new javax.swing.GroupLayout(panelRojoG);
        panelRojoG.setLayout(panelRojoGLayout);
        panelRojoGLayout.setHorizontalGroup(
            panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRojoGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoUser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(separador2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(separador1))
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(panelRojoGLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(botonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRojoGLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoMinimizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
        );
        panelRojoGLayout.setVerticalGroup(
            panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRojoGLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRojoGLayout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRojoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRojoGLayout.createSequentialGroup()
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconoPass))
                .addGap(18, 18, 18)
                .addComponent(botonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(panelRojoGLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(iconoCerrar)
                .addGap(2, 2, 2)
                .addComponent(iconoMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRojoP.setBackground(new java.awt.Color(70, 24, 30));

        javax.swing.GroupLayout panelRojoPLayout = new javax.swing.GroupLayout(panelRojoP);
        panelRojoP.setLayout(panelRojoPLayout);
        panelRojoPLayout.setHorizontalGroup(
            panelRojoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        panelRojoPLayout.setVerticalGroup(
            panelRojoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelRojoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelRojoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRojoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelRojoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
        if(user.getText().equals("User") == true){
            user.setText("");
        }
    }//GEN-LAST:event_userFocusGained

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if(pass.getText().equals("password") == true){
            pass.setText("");
        }
    }//GEN-LAST:event_passFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
        if(user.getText().trim().equals("") == true){
            user.setText("User");
        }
    }//GEN-LAST:event_userFocusLost

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        if(pass.getText().trim().equals("") == true){
            pass.setText("password");
        }
    }//GEN-LAST:event_passFocusLost

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonAcceder.doClick();
        }
    }//GEN-LAST:event_userKeyTyped

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonAcceder.doClick();
        }
    }//GEN-LAST:event_passKeyTyped

    private void botonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccederActionPerformed
        this.controlador.iniciarSesion(this);
    }//GEN-LAST:event_botonAccederActionPerformed

    private void botonAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAuxActionPerformed

    private void panelGrisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGrisMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelGrisMousePressed

    private void panelGrisMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGrisMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelGrisMouseDragged

    private void iconoCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCerrarMouseClicked
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el sistema?", "Salir", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_iconoCerrarMouseClicked

    private void iconoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMinimizarMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_iconoMinimizarMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder;
    private javax.swing.JToggleButton botonAux;
    private javax.swing.JLabel iconoCerrar;
    private javax.swing.JLabel iconoMinimizar;
    private javax.swing.JLabel iconoPass;
    private javax.swing.JLabel iconoUser;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel labelCopy;
    private javax.swing.JLabel labelIniciarSesion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelGris;
    private javax.swing.JPanel panelRojoG;
    private javax.swing.JPanel panelRojoP;
    public javax.swing.JPasswordField pass;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

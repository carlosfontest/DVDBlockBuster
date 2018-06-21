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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonAcceder = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBlackBuster.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copyright.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portada.png"))); // NOI18N

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(70, 24, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iniciarSesion.png"))); // NOI18N

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

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(botonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addContainerGap(322, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(botonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(70, 24, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el sistema?", "Salir", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    public javax.swing.JPasswordField pass;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

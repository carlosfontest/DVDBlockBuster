package view;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.Controlador;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class PanelPrincipal extends javax.swing.JPanel {
    private Controlador controlador;
    private FramePrincipal frame;

    public PanelPrincipal(Controlador controlador, FramePrincipal frame) {
        this.controlador = controlador;   
        this.frame = frame;
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) calendario.getDateEditor();
        editor.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        comboClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePeliculaCliente = new javax.swing.JTable();
        calendario = new com.toedter.calendar.JDateChooser();
        botonDevolver = new javax.swing.JButton();
        botonAlquilar = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        botonBuscarClienteP = new javax.swing.JButton();
        textFieldCedulaP = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        botonAux = new javax.swing.JToggleButton();
        barCantidadAlmacen = new javax.swing.JProgressBar();
        labelCliente1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();

        panel.setBackground(new java.awt.Color(65, 65, 65));
        panel.setPreferredSize(new java.awt.Dimension(650, 503));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        comboClientes.setBackground(new java.awt.Color(70, 24, 30));
        comboClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(255, 255, 255));
        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboClientes.setFocusable(false);
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });

        tablePeliculaCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablePeliculaCliente.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        tablePeliculaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "ID DVD", "Alquiler", "Devolucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePeliculaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePeliculaCliente.setFocusable(false);
        tablePeliculaCliente.setGridColor(new java.awt.Color(204, 204, 204));
        tablePeliculaCliente.setRowSelectionAllowed(false);
        tablePeliculaCliente.setSelectionBackground(new java.awt.Color(70, 24, 30));
        tablePeliculaCliente.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tablePeliculaCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablePeliculaCliente);

        calendario.setBackground(new java.awt.Color(70, 24, 30));
        calendario.setDateFormatString("dd/MM/yyyy");
        calendario.setFocusable(false);
        calendario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        calendario.setIcon(new ImageIcon(getClass().getResource("/images/calendario.png")));

        botonDevolver.setBackground(new java.awt.Color(70, 24, 30));
        botonDevolver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonDevolver.setForeground(new java.awt.Color(255, 255, 255));
        botonDevolver.setText("Devolver");
        botonDevolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonDevolver.setFocusPainted(false);
        botonDevolver.setFocusable(false);
        botonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverActionPerformed(evt);
            }
        });

        botonAlquilar.setBackground(new java.awt.Color(70, 24, 30));
        botonAlquilar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAlquilar.setForeground(new java.awt.Color(255, 255, 255));
        botonAlquilar.setText("Alquilar");
        botonAlquilar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAlquilar.setFocusPainted(false);
        botonAlquilar.setFocusable(false);
        botonAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlquilarActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setText("Cliente");

        botonBuscarClienteP.setBackground(new java.awt.Color(70, 24, 30));
        botonBuscarClienteP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonBuscarClienteP.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarClienteP.setText("Buscar Cliente");
        botonBuscarClienteP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarClienteP.setFocusPainted(false);
        botonBuscarClienteP.setFocusable(false);
        botonBuscarClienteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClientePActionPerformed(evt);
            }
        });

        textFieldCedulaP.setBackground(new java.awt.Color(65, 65, 65));
        textFieldCedulaP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldCedulaP.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCedulaP.setText("Cédula del cliente");
        textFieldCedulaP.setBorder(null);
        textFieldCedulaP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCedulaPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCedulaPFocusLost(evt);
            }
        });
        textFieldCedulaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCedulaPActionPerformed(evt);
            }
        });
        textFieldCedulaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCedulaPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldCedulaPKeyTyped(evt);
            }
        });

        separador1.setBackground(new java.awt.Color(70, 24, 30));
        separador1.setForeground(new java.awt.Color(70, 24, 30));

        botonAux.setBackground(new java.awt.Color(65, 65, 65));

        barCantidadAlmacen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barCantidadAlmacen.setForeground(new java.awt.Color(70, 24, 30));
        barCantidadAlmacen.setBorderPainted(false);
        barCantidadAlmacen.setStringPainted(true);

        labelCliente1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        labelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente1.setText("¿Qué tan lleno está nuestro almacén?");

        separador2.setBackground(new java.awt.Color(204, 204, 204));
        separador2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(labelCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textFieldCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addComponent(botonBuscarClienteP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barCantidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(labelCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(69, 69, 69)))))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(textFieldCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botonBuscarClienteP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(labelCliente1)
                .addGap(5, 5, 5)
                .addComponent(barCantidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        controlador.limpiarSeleccion(tablePeliculaCliente, botonAux);
    }//GEN-LAST:event_panelMousePressed

    private void textFieldCedulaPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaPFocusGained
        if(textFieldCedulaP.getText().equals("Cédula del cliente") == true){
            textFieldCedulaP.setText("");
        }
    }//GEN-LAST:event_textFieldCedulaPFocusGained

    private void textFieldCedulaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCedulaPActionPerformed
    }//GEN-LAST:event_textFieldCedulaPActionPerformed

    private void textFieldCedulaPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaPFocusLost
        if(textFieldCedulaP.getText().trim().equals("") == true){
            textFieldCedulaP.setText("Cédula del cliente");
        }
    }//GEN-LAST:event_textFieldCedulaPFocusLost

    private void textFieldCedulaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCedulaPKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonBuscarClienteP.doClick();
            return;
        }
        controlador.validarSoloNumeros(evt, this.frame);
    }//GEN-LAST:event_textFieldCedulaPKeyTyped

    private void botonBuscarClientePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClientePActionPerformed
        controlador.buscarClienteP(this);
    }//GEN-LAST:event_botonBuscarClientePActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        controlador.buscarClienteEnArchivo(this);
    }//GEN-LAST:event_comboClientesActionPerformed

    private void botonAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilarActionPerformed
        controlador.alquilar(this, this.frame);
        controlador.cargarBarraDeProgreso(frame);
    }//GEN-LAST:event_botonAlquilarActionPerformed

    private void botonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverActionPerformed
        controlador.devolver(this, this.frame);
        controlador.cargarBarraDeProgreso(frame);
    }//GEN-LAST:event_botonDevolverActionPerformed

    private void textFieldCedulaPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCedulaPKeyPressed
    }//GEN-LAST:event_textFieldCedulaPKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar barCantidadAlmacen;
    private javax.swing.JButton botonAlquilar;
    private javax.swing.JToggleButton botonAux;
    private javax.swing.JButton botonBuscarClienteP;
    private javax.swing.JButton botonDevolver;
    public com.toedter.calendar.JDateChooser calendario;
    public javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCliente1;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    public javax.swing.JTable tablePeliculaCliente;
    public javax.swing.JTextField textFieldCedulaP;
    // End of variables declaration//GEN-END:variables
}

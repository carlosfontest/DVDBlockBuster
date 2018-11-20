package view;

import controller.Controlador;
import java.awt.event.KeyEvent;
import model.DVD;

public class PanelClientes extends javax.swing.JPanel {
    private Controlador controlador;
    private FramePrincipal frame;

    public PanelClientes(Controlador controlador, FramePrincipal frame) {
        this.controlador = controlador;
        this.frame = frame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        comboEditarCliente = new javax.swing.JComboBox<>();
        botonAgregarCliente = new javax.swing.JButton();
        botonEditarCliente = new javax.swing.JButton();
        botonEliminarCliente = new javax.swing.JButton();
        botonAux = new javax.swing.JToggleButton();
        separador2 = new javax.swing.JSeparator();
        textFieldCedulaC = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        botonBuscarCedulaC = new javax.swing.JButton();

        panel.setBackground(new java.awt.Color(65, 65, 65));
        panel.setPreferredSize(new java.awt.Dimension(620, 350));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        tableClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableClientes.setAutoCreateRowSorter(true);
        tableClientes.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "ID DVD", "Título Película"
            }
        ));
        tableClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableClientes.setFocusable(false);
        tableClientes.setGridColor(new java.awt.Color(204, 204, 204));
        tableClientes.setSelectionBackground(new java.awt.Color(70, 24, 30));
        tableClientes.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tableClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableClientes);

        comboEditarCliente.setBackground(new java.awt.Color(70, 24, 30));
        comboEditarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        comboEditarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nombre", "Apellido" }));
        comboEditarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboEditarCliente.setFocusable(false);
        comboEditarCliente.setMinimumSize(new java.awt.Dimension(73, 32));

        botonAgregarCliente.setBackground(new java.awt.Color(70, 24, 30));
        botonAgregarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarCliente.setText("Agregar");
        botonAgregarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarCliente.setFocusPainted(false);
        botonAgregarCliente.setFocusable(false);
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        botonEditarCliente.setBackground(new java.awt.Color(70, 24, 30));
        botonEditarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonEditarCliente.setText("Editar");
        botonEditarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEditarCliente.setFocusPainted(false);
        botonEditarCliente.setFocusable(false);
        botonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarClienteActionPerformed(evt);
            }
        });

        botonEliminarCliente.setBackground(new java.awt.Color(70, 24, 30));
        botonEliminarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarCliente.setText("Eliminar");
        botonEliminarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminarCliente.setFocusPainted(false);
        botonEliminarCliente.setFocusable(false);
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        botonAux.setBackground(new java.awt.Color(102, 102, 102));
        botonAux.setText("jToggleButton1");

        separador2.setBackground(new java.awt.Color(204, 204, 204));
        separador2.setForeground(new java.awt.Color(204, 204, 204));

        textFieldCedulaC.setBackground(new java.awt.Color(65, 65, 65));
        textFieldCedulaC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldCedulaC.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCedulaC.setText("Cédula");
        textFieldCedulaC.setBorder(null);
        textFieldCedulaC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCedulaCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCedulaCFocusLost(evt);
            }
        });
        textFieldCedulaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCedulaCActionPerformed(evt);
            }
        });
        textFieldCedulaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldCedulaCKeyTyped(evt);
            }
        });

        separador1.setBackground(new java.awt.Color(70, 24, 30));
        separador1.setForeground(new java.awt.Color(70, 24, 30));

        botonBuscarCedulaC.setBackground(new java.awt.Color(70, 24, 30));
        botonBuscarCedulaC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonBuscarCedulaC.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarCedulaC.setText("Buscar");
        botonBuscarCedulaC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarCedulaC.setFocusPainted(false);
        botonBuscarCedulaC.setFocusable(false);
        botonBuscarCedulaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCedulaCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separador2))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(textFieldCedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonBuscarCedulaC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonBuscarCedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(comboEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addContainerGap(19, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(textFieldCedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        controlador.limpiarSeleccion(tableClientes, botonAux);
        this.textFieldCedulaC.setText("Cédula");
    }//GEN-LAST:event_panelMousePressed

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        controlador.agregarCliente(this, this.frame);
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
        controlador.eliminarCliente(this, this.frame);
    }//GEN-LAST:event_botonEliminarClienteActionPerformed

    private void botonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarClienteActionPerformed
        controlador.editarCliente(this, this.frame);
    }//GEN-LAST:event_botonEditarClienteActionPerformed

    private void textFieldCedulaCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaCFocusGained
        if(textFieldCedulaC.getText().trim().equals("Cédula") == true){
            textFieldCedulaC.setText("");
        }
    }//GEN-LAST:event_textFieldCedulaCFocusGained

    private void textFieldCedulaCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaCFocusLost
        if(textFieldCedulaC.getText().trim().equals("") == true){
            textFieldCedulaC.setText("Título");
        }
    }//GEN-LAST:event_textFieldCedulaCFocusLost

    private void textFieldCedulaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCedulaCActionPerformed

    }//GEN-LAST:event_textFieldCedulaCActionPerformed

    private void textFieldCedulaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCedulaCKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonBuscarCedulaC.doClick();
        }
        controlador.validarSoloNumeros(evt, this.frame);
    }//GEN-LAST:event_textFieldCedulaCKeyTyped

    private void botonBuscarCedulaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCedulaCActionPerformed
        controlador.buscarClienteC(this);
    }//GEN-LAST:event_botonBuscarCedulaCActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JToggleButton botonAux;
    private javax.swing.JButton botonBuscarCedulaC;
    private javax.swing.JButton botonEditarCliente;
    private javax.swing.JButton botonEliminarCliente;
    public javax.swing.JComboBox<String> comboEditarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    public javax.swing.JTable tableClientes;
    public javax.swing.JTextField textFieldCedulaC;
    // End of variables declaration//GEN-END:variables
}
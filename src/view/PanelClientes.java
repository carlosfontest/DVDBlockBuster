package view;

import controller.Controlador;

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

        panel.setBackground(new java.awt.Color(65, 65, 65));
        panel.setPreferredSize(new java.awt.Dimension(620, 350));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
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
                {"Carlos", "Fontes", "26476344", "0", "No Aplica"},
                {"Pepa", "Pig", "25369465", "5", "No Aplica"},
                {"Fatima ", "Teixeira", "21159367", "65", "No Aplica"},
                {"Augusto ", "Fontes", "6916283", "0", "No Aplica"}
            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "ID DVD", "Título Película"
            }
        ));
        tableClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separador2)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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
    }//GEN-LAST:event_panelMousePressed

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        controlador.agregarCliente(this, this.frame);
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
        controlador.eliminarCliente(this, this.frame);
    }//GEN-LAST:event_botonEliminarClienteActionPerformed

    private void botonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarClienteActionPerformed
        controlador.editarCliente(this);
    }//GEN-LAST:event_botonEditarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JToggleButton botonAux;
    private javax.swing.JButton botonEditarCliente;
    private javax.swing.JButton botonEliminarCliente;
    public javax.swing.JComboBox<String> comboEditarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator separador2;
    public javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables
}

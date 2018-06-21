package view;

import controller.Controlador;

public class PanelClientes extends javax.swing.JPanel {
    private Controlador controlador;

    public PanelClientes(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
        tableClientes.getTableHeader().setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        comboEditarCliente = new javax.swing.JComboBox<>();
        botonAgregarCliente = new javax.swing.JButton();
        botonEditarCliente = new javax.swing.JButton();
        botonEliminarCliente = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        tableClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableClientes.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableClientes.setFocusable(false);
        tableClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tableClientes.setSelectionBackground(new java.awt.Color(70, 24, 30));
        jScrollPane1.setViewportView(tableClientes);

        comboEditarCliente.setBackground(new java.awt.Color(48, 24, 30));
        comboEditarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        comboEditarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEditarCliente.setFocusable(false);

        botonAgregarCliente.setBackground(new java.awt.Color(70, 24, 30));
        botonAgregarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarCliente.setText("Agregar");
        botonAgregarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarCliente.setFocusPainted(false);
        botonAgregarCliente.setFocusable(false);

        botonEditarCliente.setBackground(new java.awt.Color(70, 24, 30));
        botonEditarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonEditarCliente.setText("Editar");
        botonEditarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEditarCliente.setFocusPainted(false);
        botonEditarCliente.setFocusable(false);

        botonEliminarCliente.setBackground(new java.awt.Color(70, 24, 30));
        botonEliminarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarCliente.setText("Eliminar");
        botonEliminarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminarCliente.setFocusPainted(false);
        botonEliminarCliente.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonEditarCliente;
    private javax.swing.JButton botonEliminarCliente;
    private javax.swing.JComboBox<String> comboEditarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables
}

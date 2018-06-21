package view;

import controller.Controlador;

public class PanelPeliculas extends javax.swing.JPanel {
    private Controlador controlador;

    public PanelPeliculas(Controlador controlador) {
        this.controlador = controlador;     
        initComponents();
        tablePeliculas.getTableHeader().setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePeliculas = new javax.swing.JTable();
        comboEditarPelicula = new javax.swing.JComboBox<>();
        botonEditarPelicula = new javax.swing.JButton();
        botonEliminarPelicula = new javax.swing.JButton();
        botonAgregarPelicula = new javax.swing.JButton();
        botonVerDescripcion = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        tablePeliculas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablePeliculas.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        tablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Género", "Precio/Dia", "Rating", "Stock"
            }
        ));
        tablePeliculas.setFocusable(false);
        tablePeliculas.setGridColor(new java.awt.Color(255, 255, 255));
        tablePeliculas.setSelectionBackground(new java.awt.Color(70, 24, 30));
        jScrollPane1.setViewportView(tablePeliculas);

        comboEditarPelicula.setBackground(new java.awt.Color(48, 24, 30));
        comboEditarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEditarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        comboEditarPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEditarPelicula.setFocusable(false);

        botonEditarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        botonEditarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEditarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        botonEditarPelicula.setText("Editar");
        botonEditarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEditarPelicula.setFocusPainted(false);
        botonEditarPelicula.setFocusable(false);

        botonEliminarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        botonEliminarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarPelicula.setText("Eliminar");
        botonEliminarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminarPelicula.setFocusPainted(false);
        botonEliminarPelicula.setFocusable(false);

        botonAgregarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        botonAgregarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAgregarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarPelicula.setText("Agregar");
        botonAgregarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarPelicula.setFocusPainted(false);
        botonAgregarPelicula.setFocusable(false);

        botonVerDescripcion.setBackground(new java.awt.Color(70, 24, 30));
        botonVerDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonVerDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        botonVerDescripcion.setText("Ver Descripción");
        botonVerDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerDescripcion.setFocusPainted(false);
        botonVerDescripcion.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVerDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
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
    private javax.swing.JButton botonAgregarPelicula;
    private javax.swing.JButton botonEditarPelicula;
    private javax.swing.JButton botonEliminarPelicula;
    private javax.swing.JButton botonVerDescripcion;
    private javax.swing.JComboBox<String> comboEditarPelicula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePeliculas;
    // End of variables declaration//GEN-END:variables
}

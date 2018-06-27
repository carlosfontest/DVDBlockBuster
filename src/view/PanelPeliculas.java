package view;

import controller.Controlador;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class PanelPeliculas extends javax.swing.JPanel {
    private Controlador controlador;
    private FramePrincipal frame;

    public PanelPeliculas(Controlador controlador, FramePrincipal frame) {
        this.controlador = controlador;     
        this.frame = frame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePeliculas = new javax.swing.JTable();
        comboEditarPelicula = new javax.swing.JComboBox<>();
        botonEditarPelicula = new javax.swing.JButton();
        botonEliminarPelicula = new javax.swing.JButton();
        botonAgregarPelicula = new javax.swing.JButton();
        botonVerDescripcion = new javax.swing.JButton();
        botonAgregarPelicula1 = new javax.swing.JButton();
        sliderStock = new javax.swing.JSlider();
        labelSliderStock = new javax.swing.JLabel();
        botonAux = new javax.swing.JToggleButton();
        separador1 = new javax.swing.JSeparator();
        textFieldCedulaP = new javax.swing.JTextField();
        botonBuscarTitulo = new javax.swing.JButton();
        separador2 = new javax.swing.JSeparator();
        comboBuscarGenero = new javax.swing.JComboBox<>();
        comboBuscarRating = new javax.swing.JComboBox<>();
        labelCliente = new javax.swing.JLabel();
        labelCliente1 = new javax.swing.JLabel();

        panel.setBackground(new java.awt.Color(65, 65, 65));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        tablePeliculas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablePeliculas.setAutoCreateRowSorter(true);
        tablePeliculas.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        tablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Género", "Rating", "Precio/día", "Stock"
            }
        ));
        tablePeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePeliculas.setFocusable(false);
        tablePeliculas.setGridColor(new java.awt.Color(204, 204, 204));
        tablePeliculas.setSelectionBackground(new java.awt.Color(70, 24, 30));
        tablePeliculas.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tablePeliculas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablePeliculas);

        comboEditarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        comboEditarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEditarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        comboEditarPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Título", "Género", "Precio", "Rating" }));
        comboEditarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboEditarPelicula.setFocusable(false);
        comboEditarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditarPeliculaActionPerformed(evt);
            }
        });

        botonEditarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        botonEditarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEditarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        botonEditarPelicula.setText("Editar");
        botonEditarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEditarPelicula.setFocusPainted(false);
        botonEditarPelicula.setFocusable(false);
        botonEditarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarPeliculaActionPerformed(evt);
            }
        });

        botonEliminarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        botonEliminarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarPelicula.setText("Eliminar Película");
        botonEliminarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminarPelicula.setFocusPainted(false);
        botonEliminarPelicula.setFocusable(false);
        botonEliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPeliculaActionPerformed(evt);
            }
        });

        botonAgregarPelicula.setBackground(new java.awt.Color(70, 24, 30));
        botonAgregarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAgregarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarPelicula.setText("Agregar Película");
        botonAgregarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarPelicula.setFocusPainted(false);
        botonAgregarPelicula.setFocusable(false);
        botonAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPeliculaActionPerformed(evt);
            }
        });

        botonVerDescripcion.setBackground(new java.awt.Color(70, 24, 30));
        botonVerDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonVerDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        botonVerDescripcion.setText("Ver Descripción");
        botonVerDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerDescripcion.setFocusPainted(false);
        botonVerDescripcion.setFocusable(false);
        botonVerDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDescripcionActionPerformed(evt);
            }
        });

        botonAgregarPelicula1.setBackground(new java.awt.Color(70, 24, 30));
        botonAgregarPelicula1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAgregarPelicula1.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarPelicula1.setText("Agregar Stock");
        botonAgregarPelicula1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarPelicula1.setFocusPainted(false);
        botonAgregarPelicula1.setFocusable(false);
        botonAgregarPelicula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPelicula1ActionPerformed(evt);
            }
        });

        sliderStock.setBackground(new java.awt.Color(65, 65, 65));
        sliderStock.setForeground(new java.awt.Color(204, 204, 204));
        sliderStock.setMajorTickSpacing(5);
        sliderStock.setMaximum(15);
        sliderStock.setMinorTickSpacing(1);
        sliderStock.setPaintTicks(true);
        sliderStock.setValue(0);
        sliderStock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sliderStock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStockStateChanged(evt);
            }
        });

        labelSliderStock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSliderStock.setForeground(new java.awt.Color(204, 204, 204));
        labelSliderStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSliderStock.setText("0");

        botonAux.setBackground(new java.awt.Color(102, 102, 102));
        botonAux.setText("jToggleButton1");

        separador1.setBackground(new java.awt.Color(70, 24, 30));
        separador1.setForeground(new java.awt.Color(70, 24, 30));

        textFieldCedulaP.setBackground(new java.awt.Color(65, 65, 65));
        textFieldCedulaP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldCedulaP.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCedulaP.setText("Título");
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldCedulaPKeyTyped(evt);
            }
        });

        botonBuscarTitulo.setBackground(new java.awt.Color(70, 24, 30));
        botonBuscarTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonBuscarTitulo.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarTitulo.setText("Buscar");
        botonBuscarTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarTitulo.setFocusPainted(false);
        botonBuscarTitulo.setFocusable(false);
        botonBuscarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarTituloActionPerformed(evt);
            }
        });

        separador2.setBackground(new java.awt.Color(204, 204, 204));
        separador2.setForeground(new java.awt.Color(204, 204, 204));

        comboBuscarGenero.setBackground(new java.awt.Color(70, 24, 30));
        comboBuscarGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBuscarGenero.setForeground(new java.awt.Color(255, 255, 255));
        comboBuscarGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Acción", "Amor", "Suspenso", "Aventura", "Terror", "Comedia" }));
        comboBuscarGenero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboBuscarGenero.setFocusable(false);
        comboBuscarGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBuscarGeneroItemStateChanged(evt);
            }
        });
        comboBuscarGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboBuscarGeneroMousePressed(evt);
            }
        });
        comboBuscarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBuscarGeneroActionPerformed(evt);
            }
        });

        comboBuscarRating.setBackground(new java.awt.Color(70, 24, 30));
        comboBuscarRating.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBuscarRating.setForeground(new java.awt.Color(255, 255, 255));
        comboBuscarRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "5" }));
        comboBuscarRating.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboBuscarRating.setFocusable(false);
        comboBuscarRating.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBuscarRatingItemStateChanged(evt);
            }
        });
        comboBuscarRating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboBuscarRatingMousePressed(evt);
            }
        });
        comboBuscarRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBuscarRatingActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setText("Rating");

        labelCliente1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        labelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente1.setText("Género");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAgregarPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(botonEliminarPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(botonEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonVerDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAgregarPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(sliderStock, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSliderStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(separador1)
                                .addComponent(botonBuscarTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(textFieldCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBuscarRating, 0, 171, Short.MAX_VALUE)
                            .addComponent(labelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBuscarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separador2)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(botonAux, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCliente)
                        .addComponent(labelCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBuscarRating, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBuscarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregarPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSliderStock)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEditarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonVerDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        controlador.limpiarSeleccion(tablePeliculas, botonAux);
        if(comboBuscarGenero.getSelectedIndex() != 0 || comboBuscarRating.getSelectedIndex() != 0){
            ((DefaultTableModel)tablePeliculas.getModel()).setRowCount(0);
            comboBuscarGenero.setSelectedIndex(0);
            comboBuscarRating.setSelectedIndex(0);
            controlador.cargarIndexPeliculas(frame);
        }
        ((DefaultTableModel)tablePeliculas.getModel()).setRowCount(0);
            controlador.cargarIndexPeliculas(frame);
    }//GEN-LAST:event_panelMousePressed

    private void botonAgregarPelicula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPelicula1ActionPerformed
        controlador.aumentarStock(this);
    }//GEN-LAST:event_botonAgregarPelicula1ActionPerformed

    private void comboEditarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditarPeliculaActionPerformed

    private void sliderStockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStockStateChanged
        controlador.mostrarValorSlider(this);
    }//GEN-LAST:event_sliderStockStateChanged

    private void botonAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPeliculaActionPerformed
        controlador.agregarPelicula(this, this.frame);
    }//GEN-LAST:event_botonAgregarPeliculaActionPerformed

    private void botonEliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPeliculaActionPerformed
        controlador.eliminarPelicula(this, this.frame);
    }//GEN-LAST:event_botonEliminarPeliculaActionPerformed

    private void textFieldCedulaPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaPFocusGained
        if(textFieldCedulaP.getText().equals("Título") == true){
            textFieldCedulaP.setText("");
        }
        this.comboBuscarGenero.setSelectedIndex(0);
        this.comboBuscarRating.setSelectedIndex(0);
    }//GEN-LAST:event_textFieldCedulaPFocusGained

    private void textFieldCedulaPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaPFocusLost
        if(textFieldCedulaP.getText().trim().equals("") == true){
            textFieldCedulaP.setText("Título");
        }
    }//GEN-LAST:event_textFieldCedulaPFocusLost

    private void textFieldCedulaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCedulaPActionPerformed

    }//GEN-LAST:event_textFieldCedulaPActionPerformed

    private void textFieldCedulaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCedulaPKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonBuscarTitulo.doClick();
        }
    }//GEN-LAST:event_textFieldCedulaPKeyTyped

    private void botonBuscarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarTituloActionPerformed
        controlador.buscarPelicula(this);
    }//GEN-LAST:event_botonBuscarTituloActionPerformed

    private void comboBuscarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBuscarGeneroActionPerformed
        tablePeliculas.clearSelection();
        controlador.mostrarGenero(this, frame);
    }//GEN-LAST:event_comboBuscarGeneroActionPerformed

    private void comboBuscarRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBuscarRatingActionPerformed
        tablePeliculas.clearSelection();
        controlador.mostrarRating(this, frame);
    }//GEN-LAST:event_comboBuscarRatingActionPerformed

    private void botonEditarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarPeliculaActionPerformed
        controlador.editarPelicula(this);
    }//GEN-LAST:event_botonEditarPeliculaActionPerformed

    private void botonVerDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDescripcionActionPerformed
        controlador.verDescripcion(this);
    }//GEN-LAST:event_botonVerDescripcionActionPerformed

    private void comboBuscarRatingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBuscarRatingItemStateChanged
        this.comboBuscarGenero.setSelectedIndex(0);
        ((DefaultTableModel)tablePeliculas.getModel()).setRowCount(0);
            controlador.cargarIndexPeliculas(frame);
    }//GEN-LAST:event_comboBuscarRatingItemStateChanged

    private void comboBuscarGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBuscarGeneroItemStateChanged
        this.comboBuscarRating.setSelectedIndex(0);
        ((DefaultTableModel)tablePeliculas.getModel()).setRowCount(0);
            controlador.cargarIndexPeliculas(frame);
    }//GEN-LAST:event_comboBuscarGeneroItemStateChanged

    private void comboBuscarGeneroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBuscarGeneroMousePressed
        this.botonAux.requestFocus();
        this.textFieldCedulaP.setText("Título");
    }//GEN-LAST:event_comboBuscarGeneroMousePressed

    private void comboBuscarRatingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBuscarRatingMousePressed
        this.botonAux.requestFocus();
        this.textFieldCedulaP.setText("Título");
    }//GEN-LAST:event_comboBuscarRatingMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPelicula;
    private javax.swing.JButton botonAgregarPelicula1;
    private javax.swing.JToggleButton botonAux;
    private javax.swing.JButton botonBuscarTitulo;
    private javax.swing.JButton botonEditarPelicula;
    private javax.swing.JButton botonEliminarPelicula;
    private javax.swing.JButton botonVerDescripcion;
    public javax.swing.JComboBox<String> comboBuscarGenero;
    public javax.swing.JComboBox<String> comboBuscarRating;
    public javax.swing.JComboBox<String> comboEditarPelicula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCliente1;
    public javax.swing.JLabel labelSliderStock;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    public javax.swing.JSlider sliderStock;
    public javax.swing.JTable tablePeliculas;
    public javax.swing.JTextField textFieldCedulaP;
    // End of variables declaration//GEN-END:variables
}

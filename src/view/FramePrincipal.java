package view;

import controller.Controlador;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FramePrincipal extends javax.swing.JFrame {
    private Controlador controlador;
    private int x,y;

    // Dynamic Panel
    public GridBagLayout layout = new GridBagLayout();
    public PanelPrincipal pPrincipal;
    public PanelClientes pClientes;
    public PanelPeliculas pPeliculas;
    

    public FramePrincipal(Controlador controlador) {       
        this.controlador = controlador;       
        initComponents();
        this.setLocation(220, 185);
        this.setResizable(false);
        this.inicioDePaneles();
        
        //Se inician las tablas
        this.controlador.iniciarTablas(pPrincipal, pClientes, pPeliculas);
        //Se pone el ícono del programa
        setIconImage(new ImageIcon(getClass().getResource("/images/logoBlackBuster.png")).getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePane = new javax.swing.JPanel();
        botonPrincipal = new javax.swing.JPanel();
        labelPrincipal = new javax.swing.JLabel();
        indicador1 = new javax.swing.JPanel();
        iconoPrincipal = new javax.swing.JLabel();
        botonClientes = new javax.swing.JPanel();
        iconoClientes = new javax.swing.JLabel();
        indicador2 = new javax.swing.JPanel();
        labelClientes = new javax.swing.JLabel();
        botonPeliculas = new javax.swing.JPanel();
        labelPeliculas = new javax.swing.JLabel();
        indicador3 = new javax.swing.JPanel();
        iconoPeliculas = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelDinamico = new javax.swing.JPanel();
        separador = new javax.swing.JPanel();
        panelHerramientas = new javax.swing.JPanel();
        iconoMinimizar = new javax.swing.JLabel();
        iconoCerrar = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        sidePane.setBackground(new java.awt.Color(70, 24, 30));

        botonPrincipal.setBackground(new java.awt.Color(48, 24, 30));
        botonPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPrincipalMousePressed(evt);
            }
        });

        labelPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPrincipal.setForeground(new java.awt.Color(204, 204, 204));
        labelPrincipal.setText("Principal");

        indicador1.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout indicador1Layout = new javax.swing.GroupLayout(indicador1);
        indicador1.setLayout(indicador1Layout);
        indicador1Layout.setHorizontalGroup(
            indicador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        indicador1Layout.setVerticalGroup(
            indicador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        iconoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iconoPrincipal.setForeground(new java.awt.Color(204, 204, 204));
        iconoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N

        javax.swing.GroupLayout botonPrincipalLayout = new javax.swing.GroupLayout(botonPrincipal);
        botonPrincipal.setLayout(botonPrincipalLayout);
        botonPrincipalLayout.setHorizontalGroup(
            botonPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPrincipalLayout.createSequentialGroup()
                .addComponent(indicador1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(iconoPrincipal)
                .addGap(12, 12, 12)
                .addComponent(labelPrincipal)
                .addGap(48, 48, 48))
        );
        botonPrincipalLayout.setVerticalGroup(
            botonPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicador1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(iconoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(labelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botonClientes.setBackground(new java.awt.Color(70, 24, 30));
        botonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonClientesMousePressed(evt);
            }
        });

        iconoClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iconoClientes.setForeground(new java.awt.Color(204, 204, 204));
        iconoClientes.setText("Clientes");

        indicador2.setOpaque(false);
        indicador2.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout indicador2Layout = new javax.swing.GroupLayout(indicador2);
        indicador2.setLayout(indicador2Layout);
        indicador2Layout.setHorizontalGroup(
            indicador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        indicador2Layout.setVerticalGroup(
            indicador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelClientes.setForeground(new java.awt.Color(204, 204, 204));
        labelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N

        javax.swing.GroupLayout botonClientesLayout = new javax.swing.GroupLayout(botonClientes);
        botonClientes.setLayout(botonClientesLayout);
        botonClientesLayout.setHorizontalGroup(
            botonClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonClientesLayout.createSequentialGroup()
                .addComponent(indicador2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelClientes)
                .addGap(12, 12, 12)
                .addComponent(iconoClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonClientesLayout.setVerticalGroup(
            botonClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicador2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(botonClientesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(iconoClientes)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(labelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botonPeliculas.setBackground(new java.awt.Color(70, 24, 30));
        botonPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPeliculasMousePressed(evt);
            }
        });

        labelPeliculas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPeliculas.setForeground(new java.awt.Color(204, 204, 204));
        labelPeliculas.setText("Películas");

        indicador3.setOpaque(false);
        indicador3.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout indicador3Layout = new javax.swing.GroupLayout(indicador3);
        indicador3.setLayout(indicador3Layout);
        indicador3Layout.setHorizontalGroup(
            indicador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        indicador3Layout.setVerticalGroup(
            indicador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        iconoPeliculas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iconoPeliculas.setForeground(new java.awt.Color(204, 204, 204));
        iconoPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peliculas.png"))); // NOI18N

        javax.swing.GroupLayout botonPeliculasLayout = new javax.swing.GroupLayout(botonPeliculas);
        botonPeliculas.setLayout(botonPeliculasLayout);
        botonPeliculasLayout.setHorizontalGroup(
            botonPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPeliculasLayout.createSequentialGroup()
                .addComponent(indicador3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(iconoPeliculas)
                .addGap(12, 12, 12)
                .addComponent(labelPeliculas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonPeliculasLayout.setVerticalGroup(
            botonPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicador3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
            .addGroup(botonPeliculasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelPeliculas)
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(iconoPeliculas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBlackBuster.png"))); // NOI18N

        javax.swing.GroupLayout sidePaneLayout = new javax.swing.GroupLayout(sidePane);
        sidePane.setLayout(sidePaneLayout);
        sidePaneLayout.setHorizontalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePaneLayout.createSequentialGroup()
                .addGroup(sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePaneLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(info))
                    .addGroup(sidePaneLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePaneLayout.setVerticalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(info)
                .addGap(8, 8, 8))
        );

        panelDinamico.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelDinamicoLayout = new javax.swing.GroupLayout(panelDinamico);
        panelDinamico.setLayout(panelDinamicoLayout);
        panelDinamicoLayout.setHorizontalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        panelDinamicoLayout.setVerticalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        separador.setBackground(new java.awt.Color(204, 204, 204));
        separador.setPreferredSize(new java.awt.Dimension(1, 100));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHerramientas.setBackground(new java.awt.Color(70, 24, 30));
        panelHerramientas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHerramientasMouseDragged(evt);
            }
        });
        panelHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHerramientasMousePressed(evt);
            }
        });

        iconoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        iconoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoMinimizarMouseClicked(evt);
            }
        });

        iconoCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        iconoCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoCerrarMouseClicked(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("I Am Awake", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Titulo.png"))); // NOI18N

        javax.swing.GroupLayout panelHerramientasLayout = new javax.swing.GroupLayout(panelHerramientas);
        panelHerramientas.setLayout(panelHerramientasLayout);
        panelHerramientasLayout.setHorizontalGroup(
            panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconoCerrar)
                .addGap(11, 11, 11))
        );
        panelHerramientasLayout.setVerticalGroup(
            panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHerramientasLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoMinimizar))
                .addGap(16, 16, 16))
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sidePane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(panelDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPrincipalMousePressed
        controlador.abrirPanelPrincipal(pPrincipal, pClientes, pPeliculas, this);
        pPrincipal.comboClientes.setSelectedIndex(0);
        controlador.cargarBarraDeProgreso(this);
    }//GEN-LAST:event_botonPrincipalMousePressed

    private void botonClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonClientesMousePressed
        controlador.abrirPanelClientes(pPrincipal, pClientes, pPeliculas, this);
        controlador.cargarIndexCedula(this);
    }//GEN-LAST:event_botonClientesMousePressed

    private void botonPeliculasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPeliculasMousePressed
        controlador.abrirPanelPeliculas(pPrincipal, pClientes, pPeliculas, this);
    }//GEN-LAST:event_botonPeliculasMousePressed

    private void iconoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMinimizarMouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_iconoMinimizarMouseClicked

    private void iconoCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCerrarMouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_iconoCerrarMouseClicked

    private void panelHerramientasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHerramientasMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelHerramientasMousePressed

    private void panelHerramientasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHerramientasMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelHerramientasMouseDragged

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        controlador.mostrarInfo(this);
    }//GEN-LAST:event_infoMouseClicked
    
    private void inicioDePaneles(){
        pPrincipal = new PanelPrincipal(controlador, this);
        pClientes = new PanelClientes(controlador, this);
        pPeliculas = new PanelPeliculas(controlador, this);
        panelDinamico.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(pPrincipal, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(pClientes, c);
        c.gridx = 0;
        c.gridy = 0;
        panelDinamico.add(pPeliculas, c);
        
        pPrincipal.setVisible(true);
        pClientes.setVisible(false);
        pPeliculas.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel botonClientes;
    public javax.swing.JPanel botonPeliculas;
    public javax.swing.JPanel botonPrincipal;
    private javax.swing.JLabel iconoCerrar;
    private javax.swing.JLabel iconoClientes;
    private javax.swing.JLabel iconoMinimizar;
    private javax.swing.JLabel iconoPeliculas;
    private javax.swing.JLabel iconoPrincipal;
    public javax.swing.JPanel indicador1;
    public javax.swing.JPanel indicador2;
    public javax.swing.JPanel indicador3;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel labelPeliculas;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JLabel labelTitulo;
    public javax.swing.JPanel panelDinamico;
    private javax.swing.JPanel panelHerramientas;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel sidePane;
    // End of variables declaration//GEN-END:variables
}

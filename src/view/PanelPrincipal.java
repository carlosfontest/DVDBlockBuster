package view;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.Controlador;

public class PanelPrincipal extends javax.swing.JPanel {
    private Controlador controlador;

    public PanelPrincipal(Controlador controlador) {
        this.controlador = controlador;   
        initComponents();
        tablePeliculaCliente.getTableHeader().setReorderingAllowed(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) fechaDevolucion.getDateEditor();
        editor.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePeliculaCliente = new javax.swing.JTable();
        fechaDevolucion = new com.toedter.calendar.JDateChooser();
        botonDevolver = new javax.swing.JButton();
        botonAlquilar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 503));

        comboClientes.setBackground(new java.awt.Color(48, 24, 30));
        comboClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(255, 255, 255));
        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboClientes.setBorder(null);
        comboClientes.setFocusable(false);

        tablePeliculaCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablePeliculaCliente.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        tablePeliculaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "ID Película", "Fecha Alquiler", "Fecha Devolucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePeliculaCliente.setFocusable(false);
        tablePeliculaCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tablePeliculaCliente.setSelectionBackground(new java.awt.Color(70, 24, 30));
        jScrollPane1.setViewportView(tablePeliculaCliente);

        fechaDevolucion.setDateFormatString("dd/MMM/yyyy");
        fechaDevolucion.setFocusable(false);
        fechaDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        botonDevolver.setBackground(new java.awt.Color(70, 24, 30));
        botonDevolver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonDevolver.setForeground(new java.awt.Color(255, 255, 255));
        botonDevolver.setText("Devolver");
        botonDevolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonDevolver.setFocusPainted(false);
        botonDevolver.setFocusable(false);

        botonAlquilar.setBackground(new java.awt.Color(70, 24, 30));
        botonAlquilar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAlquilar.setForeground(new java.awt.Color(255, 255, 255));
        botonAlquilar.setText("Alquilar");
        botonAlquilar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAlquilar.setFocusPainted(false);
        botonAlquilar.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(fechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlquilar;
    private javax.swing.JButton botonDevolver;
    private javax.swing.JComboBox<String> comboClientes;
    private com.toedter.calendar.JDateChooser fechaDevolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePeliculaCliente;
    // End of variables declaration//GEN-END:variables
}

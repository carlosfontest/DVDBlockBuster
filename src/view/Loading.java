package view;

import javax.swing.ImageIcon;

public class Loading extends javax.swing.JFrame {

    public Loading() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/images/logoBlackBuster.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBlackBuster.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 30, 75, 90);

        loadingBar.setForeground(new java.awt.Color(69, 24, 30));
        loadingBar.setBorderPainted(false);
        jPanel1.add(loadingBar);
        loadingBar.setBounds(40, 140, 250, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loading...");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 170, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar loadingBar;
    // End of variables declaration//GEN-END:variables
}

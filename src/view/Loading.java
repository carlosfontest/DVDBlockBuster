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

        panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        labelLoading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(153, 153, 153));
        panel.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBlackBuster.png"))); // NOI18N
        panel.add(logo);
        logo.setBounds(120, 30, 75, 90);

        loadingBar.setForeground(new java.awt.Color(69, 24, 30));
        loadingBar.setBorderPainted(false);
        panel.add(loadingBar);
        loadingBar.setBounds(40, 140, 250, 30);

        labelLoading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelLoading.setForeground(new java.awt.Color(255, 255, 255));
        labelLoading.setText("Loading...");
        panel.add(labelLoading);
        labelLoading.setBounds(130, 170, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelLoading;
    public javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

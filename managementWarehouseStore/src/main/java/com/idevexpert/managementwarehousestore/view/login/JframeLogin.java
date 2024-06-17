/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.idevexpert.managementwarehousestore.view.login;

import java.awt.Dimension;

/**
 *
 * @author Jesus Gutierrez
 */
public class JframeLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JframeLogin() {
        initComponents();
        setMinimumSize(new Dimension(1000, 800));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categoria.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/factura.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(0, 0, 0));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenuBar1.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(0, 0, 0));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/historial.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrarsesion.png"))); // NOI18N
        jMenu8.setText("Cerrar sesión");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu4;
    public javax.swing.JMenu jMenu5;
    public javax.swing.JMenu jMenu6;
    public javax.swing.JMenu jMenu7;
    public javax.swing.JMenu jMenu8;
    public javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

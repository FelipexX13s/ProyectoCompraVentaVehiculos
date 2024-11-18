/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author juanp
 */
public class Vender extends javax.swing.JPanel {
    GUIPrincipal p;
    IzqAdmin i;
    ArrayList<PanelCarrito> panelesCarros;
    /**
     * Creates new form Vender
     */
    public Vender(GUIPrincipal guiP, IzqAdmin iA) {
        p = guiP;
        i = iA;
        iniciarPanelesCarrito();
        panelesCarros = new ArrayList<PanelCarrito>();
        panelesCarros.add(jPanel2);
        panelesCarros.add(jPanel3);
        panelesCarros.add(jPanel4);
        panelesCarros.add(jPanel1);
        panelesCarros.add(jPanel5);
        panelesCarros.add(jPanel6);
        panelesCarros.add(jPanel7);
        panelesCarros.add(jPanel8);
        cargarCarrosDisponibles();
    }

    private void iniciarPanelesCarrito()
    {
        LBLIZIcars = new javax.swing.JLabel();
        LBLiniSesion3 = new javax.swing.JLabel();
        jPanel1 = new PanelCarrito();
        jPanel1.removeAll();
        jPanel2 = new PanelCarrito();
        jPanel2.removeAll();
        jPanel3 = new PanelCarrito();
        jPanel3.removeAll();
        jPanel4 = new PanelCarrito();
        jPanel4.removeAll();
        jPanel5 = new PanelCarrito();
        jPanel5.removeAll();
        jPanel6 = new PanelCarrito();
        jPanel6.removeAll();
        jPanel7 = new PanelCarrito();
        jPanel7.removeAll();
        jPanel8 = new PanelCarrito();
        jPanel8.removeAll();
        btnVender = new javax.swing.JPanel();
        vender = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLIZIcars.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLIZIcars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cositoLogin.png"))); // NOI18N
        LBLIZIcars.setText(" IZI CARS");
        add(LBLIZIcars, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 60));

        LBLiniSesion3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLiniSesion3.setText("/    VENDER AUTOMOVILES");
        add(LBLiniSesion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 530, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 150, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 150, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 150, 200));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 150, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 150, 200));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 150, 200));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 150, 200));

        btnVender.setBackground(new java.awt.Color(71, 193, 255));
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVenderMouseExited(evt);
            }
        });

        vender.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        vender.setForeground(new java.awt.Color(255, 255, 255));
        vender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vender.setText("VENDER");

        javax.swing.GroupLayout btnVenderLayout = new javax.swing.GroupLayout(btnVender);
        btnVender.setLayout(btnVenderLayout);
        btnVenderLayout.setHorizontalGroup(
            btnVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vender, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        btnVenderLayout.setVerticalGroup(
            btnVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vender, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 200, 50));
        
    }
    
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLIZIcars = new javax.swing.JLabel();
        LBLiniSesion3 = new javax.swing.JLabel();
        btnVender = new javax.swing.JPanel();
        vender = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLIZIcars.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLIZIcars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cositoLogin.png"))); // NOI18N
        LBLIZIcars.setText(" IZI CARS");
        add(LBLIZIcars, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 60));

        LBLiniSesion3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLiniSesion3.setText("/    VENDER AUTOMOVILES");
        add(LBLiniSesion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 530, 60));

        btnVender.setBackground(new java.awt.Color(71, 193, 255));
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVenderMouseExited(evt);
            }
        });

        vender.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        vender.setForeground(new java.awt.Color(255, 255, 255));
        vender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vender.setText("VENDER");

        javax.swing.GroupLayout btnVenderLayout = new javax.swing.GroupLayout(btnVender);
        btnVender.setLayout(btnVenderLayout);
        btnVenderLayout.setHorizontalGroup(
            btnVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vender, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        btnVenderLayout.setVerticalGroup(
            btnVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vender, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 200, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        i.venderAux();
    }//GEN-LAST:event_formMouseEntered

    private void btnVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseEntered
        // TODO add your handling code here:
        btnVender.setBackground(new java.awt.Color(0, 136, 255));
    }//GEN-LAST:event_btnVenderMouseEntered

    private void btnVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseExited
        // TODO add your handling code here:
        btnVender.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_btnVenderMouseExited

    private void btnVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseClicked
        // TODO add your handling code here:
        
        ArrayList<String> ids = new ArrayList<>();
        for(int i = 0; i < panelesCarros.size(); i++)
        {

            if((panelesCarros.get(i)).estaSeleccionado()){
                
                ids.add(panelesCarros.get(i).getID());
            }
        }
        
        //Nose meta logica, ya tiene el arraylist con los cositos seleccionados, ahora vendalos
    }//GEN-LAST:event_btnVenderMouseClicked
    
    public void ShowJPanel(JPanel p, JPanel n){
        n.setSize(150,200);
        n.setLocation(0,0);
        
        p.removeAll();
        p.add(n,BorderLayout.CENTER);
        p.revalidate();
        p.repaint();
    }
    
    public void cargarCarrosDisponibles()
    {
        for(int i = 0; i < panelesCarros.size(); i++)
        {
            if(true) // verifica la lista de carros disponibles
            {
                PanelCarrito c = new PanelCarrito();  //tiene que cambiar estos datos por los suyo de la db
                String rutaImagen = "/imagenesCarros/sparkRojo.png";
                String placa = "DRP-00" + (i+1); 
                String marca = "Chevrolet";
                String modelo = "2023";
                String color = "Rojo";

                c.setCarrito(rutaImagen, placa, marca, modelo, color);
                ShowJPanel(panelesCarros.get(i), c);
                panelesCarros.set(i, c);
                
            }
        }
    }
    
    
    private PanelCarrito jPanel1;
    private PanelCarrito jPanel2;
    private PanelCarrito jPanel3;
    private PanelCarrito jPanel4;
    private PanelCarrito jPanel5;
    private PanelCarrito jPanel6;
    private PanelCarrito jPanel7;
    private PanelCarrito jPanel8;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLIZIcars;
    private javax.swing.JLabel LBLiniSesion3;
    private javax.swing.JPanel btnVender;
    private javax.swing.JLabel vender;
    // End of variables declaration//GEN-END:variables
}

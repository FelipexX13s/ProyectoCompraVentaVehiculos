/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author juanp
 */
public class Inventario extends javax.swing.JPanel {
    GUIPrincipal p;
    IzqAdmin i;
    ArrayList<PanelCarritoInventario> panelesCarros;
    /**
     * Creates new form Inventario
     */
    public Inventario(GUIPrincipal guiP, IzqAdmin iA) {
       
        p = guiP;
        i = iA;
        iniciarPanelesCarrito();
        panelesCarros = new ArrayList<PanelCarritoInventario>();
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
        jPanel1 = new PanelCarritoInventario(p,i);
        jPanel1.removeAll();
        jPanel2 = new PanelCarritoInventario(p,i);
        jPanel2.removeAll();
        jPanel3 = new PanelCarritoInventario(p,i);
        jPanel3.removeAll();
        jPanel4 = new PanelCarritoInventario(p,i);
        jPanel4.removeAll();
        jPanel5 = new PanelCarritoInventario(p,i);
        jPanel5.removeAll();
        jPanel6 = new PanelCarritoInventario(p,i);
        jPanel6.removeAll();
        jPanel7 = new PanelCarritoInventario(p,i);
        jPanel7.removeAll();
        jPanel8 = new PanelCarritoInventario(p,i);
        jPanel8.removeAll();
        
        btnVender = new javax.swing.JPanel();
        vender = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        LBLiniSesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
       
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
        LBLiniSesion3.setText("/    INVENTARIO                                 ");
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
        
        txtMarca.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(204, 204, 204));
        txtMarca.setText("Ingrese la marca deseada");
        txtMarca.setBorder(null);
        txtMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMarcaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMarcaMousePressed(evt);
            }
        });
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 210, 30));

        LBLiniSesion.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion.setText("MARCA");
        add(LBLiniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 90, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 230, 10));
        
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
        vender.setText("BUSCAR");

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
    
    private void btnVenderMouseEntered(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        btnVender.setBackground(new java.awt.Color(0, 136, 255));
    }                                      

    private void btnVenderMouseExited(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        btnVender.setBackground(new java.awt.Color(71, 193, 255));
    }                                     

    private void btnVenderMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        
        
        for(int i = 0; i < panelesCarros.size(); i++)
        {
            if(txtMarca.getText().equals(panelesCarros.get(i).getMarca()))
            {
                
            }
            else
            {
                panelesCarros.get(i).removeAll();
                p.revalidate();
                p.repaint();
            }
        }
        
        //Nose meta logica, ya tiene el arraylist con los cositos seleccionados, ahora vendalos
    }                
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLIZIcars = new javax.swing.JLabel();
        LBLiniSesion3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        LBLiniSesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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
        LBLiniSesion3.setText("/    GESTION INVENTARIO");
        add(LBLiniSesion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 530, 60));

        txtMarca.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(204, 204, 204));
        txtMarca.setText("Ingrese la marca deseada");
        txtMarca.setBorder(null);
        txtMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMarcaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMarcaMousePressed(evt);
            }
        });
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 210, 30));

        LBLiniSesion.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion.setText("MARCA");
        add(LBLiniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 90, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 230, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        i.inventarioAux();
    }//GEN-LAST:event_formMouseEntered

    private void txtMarcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMouseExited
        // TODO add your handling code here:
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese la marca deseada");
            txtMarca.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtMarcaMouseExited

    private void txtMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMousePressed
        // TODO add your handling code here:
        if(txtMarca.getText().equals("Ingrese la marca deseada")){
            txtMarca.setText("");
            txtMarca.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtMarcaMousePressed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed
    
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
        IzqAdmin xd = i;
        for(int i = 0; i < panelesCarros.size(); i++)
        {
            if(true) // verifica la lista de carros disponibles
            {
                PanelCarritoInventario c = new PanelCarritoInventario(p,xd);  //tiene que cambiar estos datos por los suyo de la db
                String rutaImagen = "/imagenesCarros/sparkRojo.png";
                String placa = "DRP-00" + (i+1); 
                String marca = "";
                if(i<=3){
                marca = "Chevrolet";
                }
                else{
                    marca = "Renault";
                }
                String modelo = "2023";
                String color = "Rojo";

                c.setCarrito(rutaImagen, placa, marca, modelo, color);
                ShowJPanel(panelesCarros.get(i), c);
                panelesCarros.set(i, c);
                
            }
        }
    }
    
    
    private PanelCarritoInventario jPanel1;
    private PanelCarritoInventario jPanel2;
    private PanelCarritoInventario jPanel3;
    private PanelCarritoInventario jPanel4;
    private PanelCarritoInventario jPanel5;
    private PanelCarritoInventario jPanel6;
    private PanelCarritoInventario jPanel7;
    private PanelCarritoInventario jPanel8;
    private javax.swing.JPanel btnVender;
    private javax.swing.JLabel vender;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLIZIcars;
    private javax.swing.JLabel LBLiniSesion;
    private javax.swing.JLabel LBLiniSesion3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
    



}

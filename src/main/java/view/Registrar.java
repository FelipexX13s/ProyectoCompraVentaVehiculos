/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;

/**
 *
 * @author juanp
 */
public class Registrar extends javax.swing.JPanel {
    
    GUIPrincipal p;

    /**
     * Creates new form Registrar
     * @param guiP
     */
    public Registrar(GUIPrincipal guiP) {
        p = guiP;
        initComponents();
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
        btnVolver = new javax.swing.JPanel();
        LBLiniSesion2 = new javax.swing.JLabel();
        btnEmpleado = new javax.swing.JPanel();
        LBLiniSesion1 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JPanel();
        LBLiniSesion4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLIZIcars.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLIZIcars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cositoLogin.png"))); // NOI18N
        LBLIZIcars.setText(" IZI CARS");
        add(LBLIZIcars, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 250, 60));

        LBLiniSesion3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLiniSesion3.setText("REGISTRAR USUARIO");
        add(LBLiniSesion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 450, 60));

        btnVolver.setBackground(new java.awt.Color(71, 193, 255));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });

        LBLiniSesion2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        LBLiniSesion2.setForeground(new java.awt.Color(255, 255, 255));
        LBLiniSesion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLiniSesion2.setText("< VOLVER");

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LBLiniSesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolverLayout.createSequentialGroup()
                .addComponent(LBLiniSesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, -1, 70));

        btnEmpleado.setBackground(new java.awt.Color(71, 193, 255));
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseExited(evt);
            }
        });

        LBLiniSesion1.setBackground(new java.awt.Color(71, 193, 255));
        LBLiniSesion1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        LBLiniSesion1.setForeground(new java.awt.Color(255, 255, 255));
        LBLiniSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLiniSesion1.setText("EMPLEADO");

        javax.swing.GroupLayout btnEmpleadoLayout = new javax.swing.GroupLayout(btnEmpleado);
        btnEmpleado.setLayout(btnEmpleadoLayout);
        btnEmpleadoLayout.setHorizontalGroup(
            btnEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLiniSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        btnEmpleadoLayout.setVerticalGroup(
            btnEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLiniSesion1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 260, 70));

        btnAdmin.setBackground(new java.awt.Color(71, 193, 255));
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
        });

        LBLiniSesion4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        LBLiniSesion4.setForeground(new java.awt.Color(255, 255, 255));
        LBLiniSesion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLiniSesion4.setText("ADMINISTRADOR");

        javax.swing.GroupLayout btnAdminLayout = new javax.swing.GroupLayout(btnAdmin);
        btnAdmin.setLayout(btnAdminLayout);
        btnAdminLayout.setHorizontalGroup(
            btnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLiniSesion4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnAdminLayout.setVerticalGroup(
            btnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLiniSesion4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        // TODO add your handling code here:
        btnVolver.setBackground(Color.red);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        // TODO add your handling code here:
        btnVolver.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseEntered
        // TODO add your handling code here:
        btnEmpleado.setBackground(new java.awt.Color(0, 136, 255));
    }//GEN-LAST:event_btnEmpleadoMouseEntered

    private void btnEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseExited
        // TODO add your handling code here:
        btnEmpleado.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_btnEmpleadoMouseExited

    private void btnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new RegistrarEmpleado(p));
    }//GEN-LAST:event_btnEmpleadoMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new IniciarSesion(p)); //a
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new RegistrarAdmin(p));
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        // TODO add your handling code here:
        btnAdmin.setBackground(new java.awt.Color(0, 136, 255));
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        // TODO add your handling code here:
        btnAdmin.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_btnAdminMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLIZIcars;
    private javax.swing.JLabel LBLiniSesion1;
    private javax.swing.JLabel LBLiniSesion2;
    private javax.swing.JLabel LBLiniSesion3;
    private javax.swing.JLabel LBLiniSesion4;
    private javax.swing.JPanel btnAdmin;
    private javax.swing.JPanel btnEmpleado;
    private javax.swing.JPanel btnVolver;
    // End of variables declaration//GEN-END:variables
}

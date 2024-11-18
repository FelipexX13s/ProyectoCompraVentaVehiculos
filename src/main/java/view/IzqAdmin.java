/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Container;

/**
 *
 * @author juanp
 */
public class IzqAdmin extends javax.swing.JPanel {
    
    GUIPrincipal p;
    /**
     * Creates new form IzqAdmin
     */
    public IzqAdmin(GUIPrincipal guiP, String tipoUser, String usuario) {
        p = guiP;
        initComponents();
        sesion.setText(tipoUser+usuario);
        if(tipoUser.equals("Sesion Empleado: "))
        {
            // Opción 1: Ocultar completamente los paneles
        comprar.setVisible(false);
        Reportes.setVisible(false);
        
        // Opción 2: Deshabilitar los paneles
        comprar.setEnabled(false);
        Reportes.setEnabled(false);
        
        // Opción 3: Si quieres remover completamente
        // Primero, obtén el contenedor padre
        Container parent = comprar.getParent();
        if (parent != null) {
            parent.remove(comprar);
            parent.remove(Reportes);
            parent.revalidate();
            parent.repaint();
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sesion = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JPanel();
        lblCerrarSesion = new javax.swing.JLabel();
        Reportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        facturas = new javax.swing.JPanel();
        lblFacturar = new javax.swing.JLabel();
        comprar = new javax.swing.JPanel();
        lblComprar = new javax.swing.JLabel();
        inventario = new javax.swing.JPanel();
        lblInventario = new javax.swing.JLabel();
        vender = new javax.swing.JPanel();
        lblVender = new javax.swing.JLabel();
        ImagenBanner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 193, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        sesion.setForeground(new java.awt.Color(255, 255, 255));
        sesion.setText("Sesion");
        add(sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 350, 50));

        cerrarSesion.setBackground(new java.awt.Color(0, 136, 255));
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setOpaque(false);
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseExited(evt);
            }
        });

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonCerrarSesionNormalito.png"))); // NOI18N

        javax.swing.GroupLayout cerrarSesionLayout = new javax.swing.GroupLayout(cerrarSesion);
        cerrarSesion.setLayout(cerrarSesionLayout);
        cerrarSesionLayout.setHorizontalGroup(
            cerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarSesionLayout.createSequentialGroup()
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cerrarSesionLayout.setVerticalGroup(
            cerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarSesionLayout.createSequentialGroup()
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );

        add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 360, 80));

        Reportes.setBackground(new java.awt.Color(0, 136, 255));
        Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reportes.setOpaque(false);
        Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportesMouseExited(evt);
            }
        });

        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesNormalito.png"))); // NOI18N

        javax.swing.GroupLayout ReportesLayout = new javax.swing.GroupLayout(Reportes);
        Reportes.setLayout(ReportesLayout);
        ReportesLayout.setHorizontalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportesLayout.createSequentialGroup()
                .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ReportesLayout.setVerticalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportesLayout.createSequentialGroup()
                .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 360, 80));

        facturas.setBackground(new java.awt.Color(0, 136, 255));
        facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturas.setOpaque(false);
        facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturasMouseExited(evt);
            }
        });

        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarNormalito.png"))); // NOI18N

        javax.swing.GroupLayout facturasLayout = new javax.swing.GroupLayout(facturas);
        facturas.setLayout(facturasLayout);
        facturasLayout.setHorizontalGroup(
            facturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturasLayout.createSequentialGroup()
                .addComponent(lblFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        facturasLayout.setVerticalGroup(
            facturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturasLayout.createSequentialGroup()
                .addComponent(lblFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 360, 80));

        comprar.setBackground(new java.awt.Color(0, 136, 255));
        comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprar.setOpaque(false);
        comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comprarMouseExited(evt);
            }
        });

        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarNormalito.png"))); // NOI18N

        javax.swing.GroupLayout comprarLayout = new javax.swing.GroupLayout(comprar);
        comprar.setLayout(comprarLayout);
        comprarLayout.setHorizontalGroup(
            comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprarLayout.createSequentialGroup()
                .addComponent(lblComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        comprarLayout.setVerticalGroup(
            comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprarLayout.createSequentialGroup()
                .addComponent(lblComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 360, 80));

        inventario.setBackground(new java.awt.Color(0, 135, 255));
        inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventario.setOpaque(false);
        inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventarioMouseExited(evt);
            }
        });

        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioNormalito.png"))); // NOI18N

        javax.swing.GroupLayout inventarioLayout = new javax.swing.GroupLayout(inventario);
        inventario.setLayout(inventarioLayout);
        inventarioLayout.setHorizontalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventarioLayout.createSequentialGroup()
                .addComponent(lblInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inventarioLayout.setVerticalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventarioLayout.createSequentialGroup()
                .addComponent(lblInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 360, 80));

        vender.setBackground(new java.awt.Color(0, 136, 255));
        vender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vender.setOpaque(false);
        vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                venderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                venderMouseExited(evt);
            }
        });

        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderNormalito.png"))); // NOI18N

        javax.swing.GroupLayout venderLayout = new javax.swing.GroupLayout(vender);
        vender.setLayout(venderLayout);
        venderLayout.setHorizontalGroup(
            venderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, venderLayout.createSequentialGroup()
                .addComponent(lblVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        venderLayout.setVerticalGroup(
            venderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venderLayout.createSequentialGroup()
                .addComponent(lblVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 360, 80));

        ImagenBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerColores.png"))); // NOI18N
        add(ImagenBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void comprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseEntered
        // TODO add your handling code here:
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarSelected.png")));
    }//GEN-LAST:event_comprarMouseEntered

    private void comprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseExited
        // TODO add your handling code here:
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarNormalito.png")));
    }//GEN-LAST:event_comprarMouseExited

    private void ReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMouseEntered
        // TODO add your handling code here:
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesSelected.png")));
    }//GEN-LAST:event_ReportesMouseEntered

    private void ReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMouseExited
        // TODO add your handling code here:
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesNormalito.png")));
    }//GEN-LAST:event_ReportesMouseExited

    private void ReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new GenerarReporte(p,this));
    }//GEN-LAST:event_ReportesMouseClicked

    private void comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new Comprar(p,this));
    }//GEN-LAST:event_comprarMouseClicked

    private void venderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderMouseExited
        // TODO add your handling code here:
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderNormalito.png")));
    }//GEN-LAST:event_venderMouseExited

    private void venderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderMouseEntered
        // TODO add your handling code here:
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderSelected.png")));
    }//GEN-LAST:event_venderMouseEntered

    private void venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new Vender(p,this));
    }//GEN-LAST:event_venderMouseClicked

    private void inventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseExited
        // TODO add your handling code here:
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioNormalito.png")));
    }//GEN-LAST:event_inventarioMouseExited

    private void inventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseEntered
        // TODO add your handling code here:
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioSelected.png")));
    }//GEN-LAST:event_inventarioMouseEntered

    private void inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new Inventario(p,this));
    }//GEN-LAST:event_inventarioMouseClicked

    private void facturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseExited
        // TODO add your handling code here:}
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarNormalito.png")));
    }//GEN-LAST:event_facturasMouseExited

    private void facturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseEntered
        // TODO add your handling code here:
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarSelected.png")));
    }//GEN-LAST:event_facturasMouseEntered

    private void facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new Facturar(p,this));
    }//GEN-LAST:event_facturasMouseClicked

    private void cerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseExited
        // TODO add your handling code here:
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonCerrarSesionNormalito.png")));
    }//GEN-LAST:event_cerrarSesionMouseExited

    private void cerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseEntered
        // TODO add your handling code here:
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonCerrarSesionSelected.png")));
    }//GEN-LAST:event_cerrarSesionMouseEntered

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        // TODO add your handling code here:
        p.ShowJPanel(new IniciarSesion(p));
        p.ShowIzq(new IzqPrincipal());
    }//GEN-LAST:event_cerrarSesionMouseClicked

    public void inventarioAux()
    {
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioSelected.png")));
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderNormalito.png")));
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarNormalito.png")));
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarNormalito.png")));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesNormalito.png")));
    }
    
    public void venderAux()
    {
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderSelected.png")));
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioNormalito.png")));
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarNormalito.png")));
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarNormalito.png")));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesNormalito.png")));
    }
    
    public void facturarAux()
    {
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarSelected.png")));
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderNormalito.png")));
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioNormalito.png")));
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarNormalito.png")));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesNormalito.png")));
    }
    
    public void ComprarAux()
    {
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarSelected.png")));
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderNormalito.png")));
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioNormalito.png")));
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarNormalito.png")));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesNormalito.png")));
    }
    
    public void ReporteAux()
    {
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonReportesSelected.png")));
        lblVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonVenderNormalito.png")));
        lblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonInventarioNormalito.png")));
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonFacturarNormalito.png")));
        lblComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoncitos/botonComprarNormalito.png")));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenBanner;
    private javax.swing.JPanel Reportes;
    private javax.swing.JPanel cerrarSesion;
    private javax.swing.JPanel comprar;
    private javax.swing.JPanel facturas;
    private javax.swing.JPanel inventario;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblComprar;
    private javax.swing.JLabel lblFacturar;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblVender;
    private javax.swing.JLabel sesion;
    private javax.swing.JPanel vender;
    // End of variables declaration//GEN-END:variables
}

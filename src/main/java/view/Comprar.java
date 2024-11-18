/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author juanp
 */
public class Comprar extends javax.swing.JPanel {
    GUIPrincipal p;
    IzqAdmin i;
    ArrayList<String> carros; //Esto tiene que ser de vehiculo xd
    int agregados;
    String rutaImagen;
    
    public Comprar(GUIPrincipal guiP, IzqAdmin iA) {
        p = guiP;
        i = iA;
        initComponents();
        agregados = 0;
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
        LBLiniSesion = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LBLiniSesion1 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        LBLiniSesion4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtCombustible = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        LBLiniSesion7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        LBLiniSesion8 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        LBLiniSesion9 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        LBLiniSesion10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        btnAgregarA = new javax.swing.JPanel();
        LBLiniSesion5 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JPanel();
        LBLiniSesion11 = new javax.swing.JLabel();
        enLista = new javax.swing.JLabel();
        LBLiniSesion12 = new javax.swing.JLabel();
        agregarImagen = new javax.swing.JPanel();
        lblAddImagen = new javax.swing.JLabel();
        LBLiniSesion6 = new javax.swing.JLabel();

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
        LBLiniSesion3.setText("/    COMPRAR AUTOMOVILES");
        add(LBLiniSesion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 530, 60));

        LBLiniSesion.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion.setText("PLACA");
        add(LBLiniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 60));

        txtPlaca.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(204, 204, 204));
        txtPlaca.setText("Ingrese la placa");
        txtPlaca.setBorder(null);
        txtPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlacaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPlacaMousePressed(evt);
            }
        });
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 210, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 10));

        LBLiniSesion1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion1.setText("KILOMETRAJE");
        add(LBLiniSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, 60));

        txtKilometraje.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtKilometraje.setForeground(new java.awt.Color(204, 204, 204));
        txtKilometraje.setText("Ingrese el kilometraje");
        txtKilometraje.setBorder(null);
        txtKilometraje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtKilometrajeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtKilometrajeMousePressed(evt);
            }
        });
        txtKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeActionPerformed(evt);
            }
        });
        add(txtKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 210, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 230, 10));

        LBLiniSesion4.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion4.setText("MODELO");
        LBLiniSesion4.setToolTipText("");
        add(LBLiniSesion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 240, 60));

        txtModelo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(204, 204, 204));
        txtModelo.setText("Ingrese el año de salida");
        txtModelo.setToolTipText("");
        txtModelo.setBorder(null);
        txtModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModeloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtModeloMousePressed(evt);
            }
        });
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 230, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 230, 10));

        txtCombustible.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCombustible.setForeground(new java.awt.Color(204, 204, 204));
        txtCombustible.setText("Ingrese el tipo de combustible");
        txtCombustible.setToolTipText("");
        txtCombustible.setBorder(null);
        txtCombustible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCombustibleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCombustibleMousePressed(evt);
            }
        });
        txtCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombustibleActionPerformed(evt);
            }
        });
        add(txtCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 230, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 230, 10));

        LBLiniSesion7.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion7.setText("COLOR");
        add(LBLiniSesion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 200, 60));

        txtColor.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(204, 204, 204));
        txtColor.setText("Ingrese el color");
        txtColor.setBorder(null);
        txtColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtColorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtColorMousePressed(evt);
            }
        });
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 210, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 230, 10));

        LBLiniSesion8.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion8.setText("MARCA");
        add(LBLiniSesion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 200, 60));

        txtMarca.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(204, 204, 204));
        txtMarca.setText("Ingrese la marca");
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
        add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 210, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 230, 10));

        LBLiniSesion9.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion9.setText("TIPO DE VEHICULO");
        add(LBLiniSesion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 310, 60));

        txtTipo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(204, 204, 204));
        txtTipo.setText("Ingrese el tipo de vehiculo");
        txtTipo.setBorder(null);
        txtTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTipoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTipoMousePressed(evt);
            }
        });
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 210, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 230, 10));

        LBLiniSesion10.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion10.setText("PRECIO");
        add(LBLiniSesion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 270, 60));

        txtPrecio.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("Ingrese el precio");
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPrecioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 210, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 230, 10));

        btnAgregarA.setBackground(new java.awt.Color(71, 193, 255));
        btnAgregarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarAMouseExited(evt);
            }
        });

        LBLiniSesion5.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLiniSesion5.setForeground(new java.awt.Color(255, 255, 255));
        LBLiniSesion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLiniSesion5.setText("AGREGAR A LA LISTA");

        javax.swing.GroupLayout btnAgregarALayout = new javax.swing.GroupLayout(btnAgregarA);
        btnAgregarA.setLayout(btnAgregarALayout);
        btnAgregarALayout.setHorizontalGroup(
            btnAgregarALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LBLiniSesion5, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnAgregarALayout.setVerticalGroup(
            btnAgregarALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LBLiniSesion5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnAgregarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 410, 60));

        btnComprar.setBackground(new java.awt.Color(71, 193, 255));
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprarMouseExited(evt);
            }
        });

        LBLiniSesion11.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        LBLiniSesion11.setForeground(new java.awt.Color(255, 255, 255));
        LBLiniSesion11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLiniSesion11.setText("COMPRAR");

        javax.swing.GroupLayout btnComprarLayout = new javax.swing.GroupLayout(btnComprar);
        btnComprar.setLayout(btnComprarLayout);
        btnComprarLayout.setHorizontalGroup(
            btnComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprarLayout.createSequentialGroup()
                .addComponent(LBLiniSesion11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        btnComprarLayout.setVerticalGroup(
            btnComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnComprarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LBLiniSesion11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 260, 60));

        enLista.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        enLista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enLista.setText("Automoviles en la lista de compras: 0");
        add(enLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, 410, 30));

        LBLiniSesion12.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion12.setText("COMBUSTIBLE");
        add(LBLiniSesion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 240, 60));

        agregarImagen.setBackground(new java.awt.Color(71, 193, 255));
        agregarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarImagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarImagenMouseExited(evt);
            }
        });

        lblAddImagen.setBackground(new java.awt.Color(71, 193, 255));
        lblAddImagen.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblAddImagen.setForeground(new java.awt.Color(255, 255, 255));
        lblAddImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImagen.setText("AGREGAR");

        javax.swing.GroupLayout agregarImagenLayout = new javax.swing.GroupLayout(agregarImagen);
        agregarImagen.setLayout(agregarImagenLayout);
        agregarImagenLayout.setHorizontalGroup(
            agregarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        agregarImagenLayout.setVerticalGroup(
            agregarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarImagenLayout.createSequentialGroup()
                .addComponent(lblAddImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(agregarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 430, 60));

        LBLiniSesion6.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        LBLiniSesion6.setText("IMAGEN");
        add(LBLiniSesion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 110, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacaMouseExited
        // TODO add your handling code here:
        if(txtPlaca.getText().isEmpty()){
            txtPlaca.setText("Ingrese la placa");
            txtPlaca.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtPlacaMouseExited

    private void txtPlacaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacaMousePressed
        // TODO add your handling code here:
        if(txtPlaca.getText().equals("Ingrese la placa")){
            txtPlaca.setText("");
            txtPlaca.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPlacaMousePressed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtKilometrajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKilometrajeMouseExited
        // TODO add your handling code here:
        if(txtKilometraje.getText().isEmpty()){
            txtKilometraje.setText("Ingrese el kilometraje");
            txtKilometraje.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtKilometrajeMouseExited

    private void txtKilometrajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKilometrajeMousePressed
        // TODO add your handling code here:
        if(txtKilometraje.getText().equals("Ingrese el kilometraje")){
            txtKilometraje.setText("");
            txtKilometraje.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtKilometrajeMousePressed

    private void txtKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeActionPerformed

    private void txtModeloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloMouseExited
        // TODO add your handling code here:
        if(txtModelo.getText().isEmpty()){
            txtModelo.setText("Ingrese el año de salida");
            txtModelo.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtModeloMouseExited

    private void txtModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloMousePressed
        // TODO add your handling code here:
        if(txtModelo.getText().equals("Ingrese el año de salida")){
            txtModelo.setText("");
            txtModelo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtModeloMousePressed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCombustibleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCombustibleMouseExited
        // TODO add your handling code here:
        if(txtCombustible.getText().isEmpty()){
            txtCombustible.setText("Ingrese el tipo de combustible");
            txtCombustible.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtCombustibleMouseExited

    private void txtCombustibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCombustibleMousePressed
        // TODO add your handling code here:
        if(txtCombustible.getText().equals("Ingrese el tipo de combustible")){
            txtCombustible.setText("");
            txtCombustible.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCombustibleMousePressed

    private void txtCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombustibleActionPerformed

    private void txtColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtColorMouseExited
        // TODO add your handling code here:
        if(txtColor.getText().isEmpty()){
            txtColor.setText("Ingrese el color");
            txtColor.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtColorMouseExited

    private void txtColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtColorMousePressed
        // TODO add your handling code here:
        if(txtColor.getText().equals("Ingrese el color")){
            txtColor.setText("");
            txtColor.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtColorMousePressed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtMarcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMouseExited
        // TODO add your handling code here:
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese la marca");
            txtMarca.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtMarcaMouseExited

    private void txtMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMousePressed
        // TODO add your handling code here:
        if(txtMarca.getText().equals("Ingrese la marca")){
            txtMarca.setText("");
            txtMarca.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtMarcaMousePressed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtTipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMouseExited
        // TODO add your handling code here:
        if(txtTipo.getText().isEmpty()){
            txtTipo.setText("Ingrese el tipo de vehiculo");
            txtTipo.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtTipoMouseExited

    private void txtTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMousePressed
        // TODO add your handling code here:
        if(txtTipo.getText().equals("Ingrese el tipo de vehiculo")){
            txtTipo.setText("");
            txtTipo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTipoMousePressed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMouseExited
        // TODO add your handling code here:
        if(txtPrecio.getText().isEmpty()){
            txtPrecio.setText("Ingrese el precio");
            txtPrecio.setForeground(new java.awt.Color(204,204,204));
        }
    }//GEN-LAST:event_txtPrecioMouseExited

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        // TODO add your handling code here:
        if(txtPrecio.getText().equals("Ingrese el precio")){
            txtPrecio.setText("");
            txtPrecio.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAgregarAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAMouseEntered
        // TODO add your handling code here:
        btnAgregarA.setBackground(new java.awt.Color(0, 136, 255));
    }//GEN-LAST:event_btnAgregarAMouseEntered

    private void btnAgregarAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAMouseExited
        // TODO add your handling code here:
        btnAgregarA.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_btnAgregarAMouseExited

    private void btnComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseEntered
        // TODO add your handling code here:
        btnComprar.setBackground(new java.awt.Color(0, 136, 255));
    }//GEN-LAST:event_btnComprarMouseEntered

    private void btnComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseExited
        // TODO add your handling code here:
        btnComprar.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_btnComprarMouseExited

    private void btnAgregarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAMouseClicked
        // TODO add your handling code here:
        String color = txtColor.getText();
        String combustible = txtCombustible.getText();
        String kilometraje = txtKilometraje.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String placa = txtPlaca.getText();
        //long precio = Long.parseLong(txtPrecio.getText());
        String tipo = txtTipo.getText();
        String imagen = rutaImagen;
        
        //Crear el objeto vehiculo con los campos carroNuevo
        
        //carros.add(carroNuevo);
        
        txtColor.setText("");
        txtCombustible.setText("");
        txtKilometraje.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPlaca.setText("");
        txtPrecio.setText("");
        txtTipo.setText("");
        lblAddImagen.setText("AGREGAR");
        
        agregados += 1;
        
        enLista.setText("Automoviles en la lista de compras: " + agregados);
     
    }//GEN-LAST:event_btnAgregarAMouseClicked

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        // TODO add your handling code here:
        // nose, mande la lista de carros (carros) para hacer la compra supongo xd
        
        agregados = 0;
        enLista.setText("Automoviles en la lista de compras: " + agregados);
    }//GEN-LAST:event_btnComprarMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        i.ComprarAux();
    }//GEN-LAST:event_formMouseEntered

    private void agregarImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarImagenMouseExited
        // TODO add your handling code here:
        agregarImagen.setBackground(new java.awt.Color(71, 193, 255));
    }//GEN-LAST:event_agregarImagenMouseExited

    private void agregarImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarImagenMouseEntered
        // TODO add your handling code here:
        agregarImagen.setBackground(new java.awt.Color(0, 136, 255));
    }//GEN-LAST:event_agregarImagenMouseEntered

    private void agregarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarImagenMouseClicked
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("./src/main/resources/imagenesCarros")); // Cambia la ruta por la que necesites
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                
                // Filtrar solo imágenes (opcional)
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "jpeg", "gif"));

                // Mostrar el diálogo de selección de archivos
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String imageName = selectedFile.getName();
                    rutaImagen = selectedFile.getAbsolutePath();
                    lblAddImagen.setText(imageName);
                }
        
        
    }//GEN-LAST:event_agregarImagenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLIZIcars;
    private javax.swing.JLabel LBLiniSesion;
    private javax.swing.JLabel LBLiniSesion1;
    private javax.swing.JLabel LBLiniSesion10;
    private javax.swing.JLabel LBLiniSesion11;
    private javax.swing.JLabel LBLiniSesion12;
    private javax.swing.JLabel LBLiniSesion3;
    private javax.swing.JLabel LBLiniSesion4;
    private javax.swing.JLabel LBLiniSesion5;
    private javax.swing.JLabel LBLiniSesion6;
    private javax.swing.JLabel LBLiniSesion7;
    private javax.swing.JLabel LBLiniSesion8;
    private javax.swing.JLabel LBLiniSesion9;
    private javax.swing.JPanel agregarImagen;
    private javax.swing.JPanel btnAgregarA;
    private javax.swing.JPanel btnComprar;
    private javax.swing.JLabel enLista;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAddImagen;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCombustible;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

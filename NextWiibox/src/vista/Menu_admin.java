/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.BorderLayout;

/**
 *
 * @author thoma
 */
public class Menu_admin extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu_admin() {
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

        menu = new javax.swing.JPanel();
        jPanel_ingresar = new javax.swing.JPanel();
        jLabel_Acceder = new javax.swing.JLabel();
        jPanel_actualizar = new javax.swing.JPanel();
        jLabel_Acceder1 = new javax.swing.JLabel();
        jPanel_eliminar = new javax.swing.JPanel();
        jLabel_Acceder2 = new javax.swing.JLabel();
        jPanel_cerrar_sesion = new javax.swing.JPanel();
        jLabel_Acceder3 = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_ingresar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Acceder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder.setText("Ingresar Arriendo");
        jLabel_Acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AccederMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ingresarLayout = new javax.swing.GroupLayout(jPanel_ingresar);
        jPanel_ingresar.setLayout(jPanel_ingresarLayout);
        jPanel_ingresarLayout.setHorizontalGroup(
            jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ingresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_ingresarLayout.setVerticalGroup(
            jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ingresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(jPanel_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 122, -1, -1));

        jPanel_actualizar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Acceder1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder1.setText("Actualizar Arriendo");
        jLabel_Acceder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_actualizarLayout = new javax.swing.GroupLayout(jPanel_actualizar);
        jPanel_actualizar.setLayout(jPanel_actualizarLayout);
        jPanel_actualizarLayout.setHorizontalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_actualizarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_actualizarLayout.setVerticalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_actualizarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(jPanel_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 212, -1, -1));

        jPanel_eliminar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Acceder2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder2.setText("Eliminar Arriendo");
        jLabel_Acceder2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_eliminarLayout = new javax.swing.GroupLayout(jPanel_eliminar);
        jPanel_eliminar.setLayout(jPanel_eliminarLayout);
        jPanel_eliminarLayout.setHorizontalGroup(
            jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_eliminarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_eliminarLayout.setVerticalGroup(
            jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_eliminarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(jPanel_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 302, -1, -1));

        jPanel_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));

        jLabel_Acceder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder3.setText("Cerrar Sesión");
        jLabel_Acceder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_cerrar_sesionLayout = new javax.swing.GroupLayout(jPanel_cerrar_sesion);
        jPanel_cerrar_sesion.setLayout(jPanel_cerrar_sesionLayout);
        jPanel_cerrar_sesionLayout.setHorizontalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cerrar_sesionLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel_cerrar_sesionLayout.setVerticalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menu.add(jPanel_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 392, 200, -1));

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Menu");
        menu.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 56, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_AccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AccederMouseClicked
        IngresarArriendo ingresarArriendo = new IngresarArriendo();
        ingresarArriendo.setSize(660, 460);
        ingresarArriendo.setLocation(0,0);
        
        menu.removeAll();
        menu.add(ingresarArriendo,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_AccederMouseClicked

    private void jLabel_Acceder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder1MouseClicked
        ActualizarUsuario actualizarUsuario = new ActualizarUsuario();
        actualizarUsuario.setSize(660, 460);
        actualizarUsuario.setLocation(0,0);
        
        menu.removeAll();
        menu.add(actualizarUsuario,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_Acceder1MouseClicked

    private void jLabel_Acceder2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder2MouseClicked
        EliminarArriendo eliminarArriendo = new EliminarArriendo();
        eliminarArriendo.setSize(660, 460);
        eliminarArriendo.setLocation(0,0);
        
        menu.removeAll();
        menu.add(eliminarArriendo,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_Acceder2MouseClicked

    private void jLabel_Acceder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder3MouseClicked
        Login login = new Login();
        login.setSize(660, 460);
        login.setLocation(0,0);
        
        menu.removeAll();
        menu.add(login,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
        
    }//GEN-LAST:event_jLabel_Acceder3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Acceder;
    private javax.swing.JLabel jLabel_Acceder1;
    private javax.swing.JLabel jLabel_Acceder2;
    private javax.swing.JLabel jLabel_Acceder3;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_actualizar;
    private javax.swing.JPanel jPanel_cerrar_sesion;
    private javax.swing.JPanel jPanel_eliminar;
    private javax.swing.JPanel jPanel_ingresar;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author HP Desktop
 */
public class ActualizarDesarrollador extends javax.swing.JPanel {

    /**
     * Creates new form ActualizarDesarrollador
     */
    public ActualizarDesarrollador() {
        initComponents();
        ocultar.setVisible(false);
        jPanel_actualizar.setVisible(false);
    }
    private int posicionUsuario=-1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_actdesarrollador = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut = new javax.swing.JLabel();
        jTextField_rut = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jPanel_buscar = new javax.swing.JPanel();
        jLabel_buscar = new javax.swing.JLabel();
        jPanel_actualizar = new javax.swing.JPanel();
        jLabel_actualizar = new javax.swing.JLabel();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        ocultar = new javax.swing.JPanel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jTextField_Nombre1 = new javax.swing.JTextField();
        jSeparator_Nombre1 = new javax.swing.JSeparator();
        jLabel_comuna1 = new javax.swing.JLabel();
        jTextField_comuna1 = new javax.swing.JTextField();
        jSeparator_comuna1 = new javax.swing.JSeparator();
        jLabel_telefono1 = new javax.swing.JLabel();
        jTextField_telefono1 = new javax.swing.JTextField();
        jSeparator_telefono1 = new javax.swing.JSeparator();

        jPanel_actdesarrollador.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_actdesarrollador.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_actdesarrollador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Actualizar desarrollador");
        jPanel_actdesarrollador.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut:");
        jPanel_actdesarrollador.add(jLabel_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        jTextField_rut.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_rut.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_rut.setText("11.111.111-1");
        jTextField_rut.setBorder(null);
        jPanel_actdesarrollador.add(jTextField_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 270, -1));
        jPanel_actdesarrollador.add(jSeparator_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 270, 10));

        jPanel_buscar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_buscar.setText("Buscar");
        jLabel_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_buscarLayout = new javax.swing.GroupLayout(jPanel_buscar);
        jPanel_buscar.setLayout(jPanel_buscarLayout);
        jPanel_buscarLayout.setHorizontalGroup(
            jPanel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buscarLayout.createSequentialGroup()
                .addComponent(jLabel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_buscarLayout.setVerticalGroup(
            jPanel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buscarLayout.createSequentialGroup()
                .addComponent(jLabel_buscar)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel_actdesarrollador.add(jPanel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 100, 30));

        jPanel_actualizar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_actualizar.setText("Actualizar");
        jLabel_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_actualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_actualizarLayout = new javax.swing.GroupLayout(jPanel_actualizar);
        jPanel_actualizar.setLayout(jPanel_actualizarLayout);
        jPanel_actualizarLayout.setHorizontalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_actualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_actualizarLayout.setVerticalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_actualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_actdesarrollador.add(jPanel_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jPanel_menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menu.setText("Atras");
        jLabel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_actdesarrollador.add(jPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        ocultar.setBackground(new java.awt.Color(51, 51, 51));
        ocultar.setForeground(new java.awt.Color(51, 51, 51));
        ocultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Nombre1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Nombre1.setText("Nombre:");
        ocultar.add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jTextField_Nombre1.setEditable(false);
        jTextField_Nombre1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_Nombre1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_Nombre1.setBorder(null);
        ocultar.add(jTextField_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, -1));
        ocultar.add(jSeparator_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, 10));

        jLabel_comuna1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_comuna1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_comuna1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_comuna1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_comuna1.setText("Direccion:");
        ocultar.add(jLabel_comuna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        jTextField_comuna1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_comuna1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_comuna1.setBorder(null);
        ocultar.add(jTextField_comuna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 270, -1));
        ocultar.add(jSeparator_comuna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, 10));

        jLabel_telefono1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_telefono1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_telefono1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_telefono1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_telefono1.setText("Fono:");
        ocultar.add(jLabel_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        jTextField_telefono1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_telefono1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_telefono1.setBorder(null);
        ocultar.add(jTextField_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, -1));
        ocultar.add(jSeparator_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 270, 10));

        jPanel_actdesarrollador.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 440, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel_actdesarrollador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel_actdesarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_actualizarMouseClicked
        // Guardar los datos nuevos
        String nombre = jTextField_Nombre1.getText();
        String direccion = jTextField_comuna1.getText();
        String fono = jTextField_telefono1.getText();
        
        Visualizador.sistema.actualizarDesarrollador(posicionUsuario, fono, nombre, direccion);
        JOptionPane.showMessageDialog(null,"Datos actualizados");
        ocultar.setVisible(false);
        jPanel_actualizar.setVisible(false);
    }//GEN-LAST:event_jLabel_actualizarMouseClicked

    private void jLabel_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_buscarMouseClicked
        //Buscar al usuario segun el rut
        String rut = jTextField_rut.getText();
        int posicion = Visualizador.sistema.buscarDesarrollador(rut);
        if(posicion == -1){
            JOptionPane.showMessageDialog(null,"No existe un desarrollador con este rut");
        }else{
            posicionUsuario=posicion;
            String [] datosDesarrollador = Visualizador.sistema.obtenerDatosDesarrollador(posicion);
            String nombre = datosDesarrollador[0];
            String direccion = datosDesarrollador[1];
            String fono = datosDesarrollador[2];
            jTextField_Nombre1.setText(nombre);
            jTextField_comuna1.setText(direccion);
            jTextField_telefono1.setText(fono);

            ocultar.setVisible(true);
            jPanel_actualizar.setVisible(true);
        }
    }//GEN-LAST:event_jLabel_buscarMouseClicked

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        Adm_Desarrollador adm_Desarrollador = new Adm_Desarrollador();
        adm_Desarrollador.setSize(660, 460);
        adm_Desarrollador.setLocation(0,0);

        jPanel_actdesarrollador.removeAll();
        jPanel_actdesarrollador.add(adm_Desarrollador,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        jPanel_actdesarrollador.revalidate();
        jPanel_actdesarrollador.repaint();
    }//GEN-LAST:event_jLabel_menuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_actualizar;
    private javax.swing.JLabel jLabel_buscar;
    private javax.swing.JLabel jLabel_comuna1;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JLabel jLabel_telefono1;
    private javax.swing.JPanel jPanel_actdesarrollador;
    private javax.swing.JPanel jPanel_actualizar;
    private javax.swing.JPanel jPanel_buscar;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JSeparator jSeparator_Nombre1;
    private javax.swing.JSeparator jSeparator_comuna1;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JSeparator jSeparator_telefono1;
    private javax.swing.JTextField jTextField_Nombre1;
    private javax.swing.JTextField jTextField_comuna1;
    private javax.swing.JTextField jTextField_rut;
    private javax.swing.JTextField jTextField_telefono1;
    private javax.swing.JPanel ocultar;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author thoma
 */
public class IngresarArriendo extends javax.swing.JPanel {

    /**
     * Creates new form IngresarUsuario
     */
    public IngresarArriendo() {
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

        ingresarUsuario = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut = new javax.swing.JLabel();
        jTextField_rutCliente = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_codigoVideoJuego = new javax.swing.JTextField();
        jSeparator_nombre = new javax.swing.JSeparator();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel_registrar = new javax.swing.JPanel();
        jLabel_registrar = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));
        setPreferredSize(new java.awt.Dimension(610, 460));

        ingresarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        ingresarUsuario.setMinimumSize(new java.awt.Dimension(0, 0));
        ingresarUsuario.setPreferredSize(new java.awt.Dimension(610, 460));
        ingresarUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ingresarUsuarioMouseDragged(evt);
            }
        });

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Ingresar Arriendo");

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut cliente:");

        jTextField_rutCliente.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_rutCliente.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_rutCliente.setText("00.000.000-K");
        jTextField_rutCliente.setBorder(null);

        jLabel_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_nombre.setText("Codigo videojuego:");

        jTextField_codigoVideoJuego.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_codigoVideoJuego.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_codigoVideoJuego.setText("0001");
        jTextField_codigoVideoJuego.setBorder(null);

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

        jPanel_registrar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_registrar.setText("Registrar");
        jLabel_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registrarLayout = new javax.swing.GroupLayout(jPanel_registrar);
        jPanel_registrar.setLayout(jPanel_registrarLayout);
        jPanel_registrarLayout.setHorizontalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_registrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_registrarLayout.setVerticalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_registrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ingresarUsuarioLayout = new javax.swing.GroupLayout(ingresarUsuario);
        ingresarUsuario.setLayout(ingresarUsuarioLayout);
        ingresarUsuarioLayout.setHorizontalGroup(
            ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel_Titulo))
                    .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel_nombre)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_codigoVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        ingresarUsuarioLayout.setVerticalGroup(
            ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel_Titulo)
                .addGap(25, 25, 25)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_rut)
                    .addComponent(jTextField_rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_codigoVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        Menu_vendedor Menu_vendedor = new Menu_vendedor();
        Menu_vendedor.setSize(660, 460);
        Menu_vendedor.setLocation(0,0);

        ingresarUsuario.removeAll();
        ingresarUsuario.add(Menu_vendedor,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        ingresarUsuario.revalidate();
        ingresarUsuario.repaint();
    }//GEN-LAST:event_jLabel_menuMouseClicked
    /**
     * Este boton hace el control de error para los diferentes inputs del usuario llamando a la funcion de abajo.
     * @param evt 
     */
    private void jLabel_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registrarMouseClicked
        String rutCliente = jTextField_rutCliente.getText();
        verificarCamposEnBlanco(rutCliente, "rutCliente");
        
        String codigoVideoJuego = jTextField_codigoVideoJuego.getText();
        verificarCamposEnBlanco(codigoVideoJuego, "codigoVideoJuego");

        String fechaI="";
        String fechaE="";

        try{
            Visualizador.sistema.ingresarArriendo(codigoVideoJuego, rutCliente, fechaI, fechaE);
            JOptionPane.showMessageDialog(null,"Usuario ingresado.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
    }//GEN-LAST:event_jLabel_registrarMouseClicked
    public void verificarCamposEnBlanco(String campo,String nombre){
        if(campo.equals("")){
            JOptionPane.showMessageDialog(null,"El/La "+nombre+" no puede estar en blanco.");
        }
    }
    private void ingresarUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarUsuarioMouseDragged
        //BORRAR
    }//GEN-LAST:event_ingresarUsuarioMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ingresarUsuario;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_registrar;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_registrar;
    private javax.swing.JSeparator jSeparator_nombre;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JTextField jTextField_codigoVideoJuego;
    private javax.swing.JTextField jTextField_rutCliente;
    // End of variables declaration//GEN-END:variables
}

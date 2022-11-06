/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author reeso
 */
public class IngresarVideoJuego extends javax.swing.JPanel {

    /**
     * Creates new form IngresarVideoJuego
     */
    public IngresarVideoJuego() {
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

        ingresarVideoJuego = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_codigo = new javax.swing.JLabel();
        jTextField_codigo = new javax.swing.JTextField();
        jSeparator_codigo = new javax.swing.JSeparator();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jSeparator_nombre = new javax.swing.JSeparator();
        jLabel_version = new javax.swing.JLabel();
        jTextField_version = new javax.swing.JTextField();
        jSeparator_version = new javax.swing.JSeparator();
        jLabel_fecha = new javax.swing.JLabel();
        jTextField_fecha = new javax.swing.JTextField();
        jSeparator_fecha = new javax.swing.JSeparator();
        jLabel_categoria = new javax.swing.JLabel();
        jTextField_categoria = new javax.swing.JTextField();
        jSeparator_categoria = new javax.swing.JSeparator();
        jLabel_genero = new javax.swing.JLabel();
        jTextField_genero = new javax.swing.JTextField();
        jSeparator_genero = new javax.swing.JSeparator();
        jLabel_precio = new javax.swing.JLabel();
        jTextField_precio = new javax.swing.JTextField();
        jSeparator_desarrollador = new javax.swing.JSeparator();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel_registrar = new javax.swing.JPanel();
        jLabel_registrar = new javax.swing.JLabel();
        jLabel_desarrollador = new javax.swing.JLabel();
        jTextField_desarrollador = new javax.swing.JTextField();
        jSeparator_precio = new javax.swing.JSeparator();

        ingresarVideoJuego.setBackground(new java.awt.Color(51, 51, 51));
        ingresarVideoJuego.setPreferredSize(new java.awt.Dimension(610, 460));
        ingresarVideoJuego.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ingresarVideoJuegoMouseDragged(evt);
            }
        });

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Ingresar videojuego");

        jLabel_codigo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_codigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_codigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_codigo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_codigo.setText("Codigo:");

        jTextField_codigo.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_codigo.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_codigo.setText("00.000.000-K");
        jTextField_codigo.setBorder(null);

        jLabel_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_nombre.setText("Nombre:");

        jTextField_nombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_nombre.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_nombre.setText("Juan Navarro");
        jTextField_nombre.setBorder(null);

        jLabel_version.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_version.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_version.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_version.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_version.setText("Version:");

        jTextField_version.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_version.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_version.setText("correoFalso@dominioFalso.cl");
        jTextField_version.setBorder(null);

        jLabel_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fecha.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fecha.setText("Fecha:");

        jTextField_fecha.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_fecha.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_fecha.setText("San Joaquin");
        jTextField_fecha.setBorder(null);

        jLabel_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_categoria.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_categoria.setText("Categoria:");

        jTextField_categoria.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_categoria.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_categoria.setText("Industrias 111");
        jTextField_categoria.setBorder(null);

        jLabel_genero.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_genero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_genero.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_genero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_genero.setText("Genero:");

        jTextField_genero.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_genero.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_genero.setText("+56 9 0000 0000");
        jTextField_genero.setBorder(null);

        jLabel_precio.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_precio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_precio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_precio.setText("Precio:");

        jTextField_precio.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_precio.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_precio.setText("DD/MM/YY");
        jTextField_precio.setBorder(null);

        jPanel_menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menu.setText("Menu");
        jLabel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_registrarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel_registrarLayout.setVerticalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_registrarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel_desarrollador.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_desarrollador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_desarrollador.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_desarrollador.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_desarrollador.setText("Rut desarrollador:");

        jTextField_desarrollador.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_desarrollador.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_desarrollador.setText("11.111.111-1");
        jTextField_desarrollador.setBorder(null);

        javax.swing.GroupLayout ingresarVideoJuegoLayout = new javax.swing.GroupLayout(ingresarVideoJuego);
        ingresarVideoJuego.setLayout(ingresarVideoJuegoLayout);
        ingresarVideoJuegoLayout.setHorizontalGroup(
            ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel_Titulo))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_version, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_version, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_version, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_desarrollador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator_desarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_desarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        ingresarVideoJuegoLayout.setVerticalGroup(
            ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel_Titulo)
                .addGap(25, 25, 25)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_codigo)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_version)
                    .addComponent(jTextField_version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_version, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fecha)
                    .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_categoria)
                    .addComponent(jTextField_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_genero)
                    .addComponent(jTextField_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_precio)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarVideoJuegoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_desarrollador)
                            .addComponent(jTextField_desarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator_desarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(ingresarVideoJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarVideoJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ingresarVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        Menu menu = new Menu();
        menu.setSize(660, 460);
        menu.setLocation(0,0);

        ingresarVideoJuego.removeAll();
        ingresarVideoJuego.add(menu,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        ingresarVideoJuego.revalidate();
        ingresarVideoJuego.repaint();
    }//GEN-LAST:event_jLabel_menuMouseClicked

    private void jLabel_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registrarMouseClicked
        
        String codigo = jTextField_codigo.getText();
        verificarCamposEnBlanco(codigo, "codigo");

        String nombre = jTextField_nombre.getText();
        verificarCamposEnBlanco(nombre, "nombre");

        String version = jTextField_version.getText();
        verificarCamposEnBlanco(version, "version");
 
        String fecha = jTextField_fecha.getText();
        verificarCamposEnBlanco(fecha, "fecha");

        String categoria = jTextField_categoria.getText();
        verificarCamposEnBlanco(categoria, "categoria");

        String genero = jTextField_genero.getText();
        verificarCamposEnBlanco(genero, "genero");
        
        String precio = jTextField_precio.getText();
        verificarCamposEnBlanco(precio, "precio");
        
        String desarrollador = jTextField_desarrollador.getText();
        verificarCamposEnBlanco(desarrollador, "desarrollador");
        
        
    }//GEN-LAST:event_jLabel_registrarMouseClicked
    
    public void verificarCamposEnBlanco(String campo,String nombre){
        if(campo.equals("")){
            JOptionPane.showMessageDialog(null,"El/La "+nombre+" no puede estar en blanco.");
        }
    }
    
    private void ingresarVideoJuegoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarVideoJuegoMouseDragged
        //BORRAR
    }//GEN-LAST:event_ingresarVideoJuegoMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ingresarVideoJuego;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_categoria;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_desarrollador;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_genero;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_precio;
    private javax.swing.JLabel jLabel_registrar;
    private javax.swing.JLabel jLabel_version;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_registrar;
    private javax.swing.JSeparator jSeparator_categoria;
    private javax.swing.JSeparator jSeparator_codigo;
    private javax.swing.JSeparator jSeparator_desarrollador;
    private javax.swing.JSeparator jSeparator_fecha;
    private javax.swing.JSeparator jSeparator_genero;
    private javax.swing.JSeparator jSeparator_nombre;
    private javax.swing.JSeparator jSeparator_precio;
    private javax.swing.JSeparator jSeparator_version;
    private javax.swing.JTextField jTextField_categoria;
    private javax.swing.JTextField jTextField_codigo;
    private javax.swing.JTextField jTextField_desarrollador;
    private javax.swing.JTextField jTextField_fecha;
    private javax.swing.JTextField jTextField_genero;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_precio;
    private javax.swing.JTextField jTextField_version;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thoma
 */
public class Pruebas extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    private DefaultTableModel tabla;
    public Pruebas() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        tabla = model;
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
        jPanel_cerrar_sesion = new javax.swing.JPanel();
        jLabel_Acceder3 = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));

        jLabel_Acceder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder3.setText("Atras");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1"}
            },
            new String [] {
                "Rut", "Codigo", "Fecha de entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        menu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 290));

        jButton1.setText("Interactuar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        jButton2.setText("eliminar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        jButton3.setText("actualizar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Acceder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder3MouseClicked
        Login login = new Login();
        login.setSize(660, 460);
        login.setLocation(0,0);
        
        menu.removeAll();
        menu.add(login,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
        
    }//GEN-LAST:event_jLabel_Acceder3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //System.out.println(jTable1.getSelectedRow());//obtiene la posicion de la fila seleccionada dentro de la tabla
        //jTable1.setValueAt("a", 0, 0);//da un valor en una posicion especifica
        
        List <String[]> matriz = crearMatriz();
        
        for(int i = 0;i<matriz.size();i++){
            tabla.addRow(matriz.get(i));
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        eliminarTodo();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        List <Vector> matriz =tabla.getDataVector();
        for(int i=0;i<matriz.size();i++){
            System.out.println(matriz.get(i));
        }
    }//GEN-LAST:event_jButton3MouseClicked
    private void eliminarTodo(){
        int fila = jTable1.getRowCount();
        System.out.println("filas: "+fila);
        for(int i=fila-1;i>=0;i--){
            tabla.removeRow(i);
        }
    }
    private List <String[]> crearMatriz(){
        int rut =1;
        int code=10;
        int fecha=100;
        List <String[]> matriz = new ArrayList<>();
        for(int i=0;i<3;i++){
            String [] lista = new String[3];
            lista[0] = (rut*(i+1))+"";
            lista[1] = (code*(i+1))+"";
            lista[2] = (fecha*(i+1))+"";
            matriz.add(lista);
        }
        return matriz;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel_Acceder3;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_cerrar_sesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}


package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author equipo2
 */
public class Ver_Producto extends javax.swing.JFrame {
String user;
public static  String prod_update = "";
DefaultTableModel model = new DefaultTableModel(); //acceso para los metodos de la tabla añadir filas  y columnas
        
    /**
     * Creates new form Ver_Producto
     */
    public Ver_Producto() {
        initComponents();
          user = Login.user;
        
         setSize(594, 418);
        setResizable(false);
        setTitle("usuarios registrados "+ user);
        setLocationRelativeTo(null);
        
        ImageIcon wallpapper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon Icono = new ImageIcon(wallpapper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(Icono);
        this.repaint();
        
        try {
            Connection cnx = Conexion.conectar();
            PreparedStatement pst  = cnx.prepareStatement(""
                    + "select productos_id, producto_nombre,dosis, descripcion, precio from productos");
             ResultSet rs = pst.executeQuery();
             jTable_producto = new JTable(model);
             jScrollPane1.setViewportView(jTable_producto);
             model.addColumn(" ID ");
             model.addColumn("Nombre producto");
             model.addColumn("Dosis del producto ");
             model.addColumn("Descripcion");
             model.addColumn("precio");
             
             while(rs.next()){
                 Object[] fila = new Object [5];
                 for (int i = 0; i < 5; i++) {
                     fila[i] = rs.getObject(i+1);
                 }
                 model.addRow(fila);
             }
             cnx.close();
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error  de sistema");
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_producto = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Reporte de productos ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 290, -1));

        jTable_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_producto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 220));

        jButton5.setText("Regresar ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 418));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Interfaz registrarp = new Interfaz();
        registrarp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ver_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_producto;
    // End of variables declaration//GEN-END:variables
}

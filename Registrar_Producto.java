
package ventanas;
import clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 *
 * @author equipo2
 */
public class Registrar_Producto extends javax.swing.JFrame {
    
    String user;

    /**
     * Creates new form Registrar_Producto
     */
    public Registrar_Producto() {
        initComponents();
        user = Login.user;
        
         setSize(500, 500);
        setResizable(false);
        setTitle("Registro de productos"+ user);
        setLocationRelativeTo(null);
        
        
        ImageIcon wallpapper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon Icono = new ImageIcon(wallpapper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(Icono);
        this.repaint();
    }
    @Override
   public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/farmacia.png"));
       return retValue;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jText_nomp = new javax.swing.JTextField();
        jText_cantidad = new javax.swing.JTextField();
        jText_des = new javax.swing.JTextField();
        jText_precio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Productos ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dosis ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jText_nomp.setBackground(new java.awt.Color(255, 255, 255));
        jText_nomp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jText_nomp.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jText_nomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 230, -1));

        jText_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        jText_cantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jText_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jText_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 230, -1));

        jText_des.setBackground(new java.awt.Color(255, 255, 255));
        jText_des.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jText_des.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jText_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 60));

        jText_precio.setBackground(new java.awt.Color(255, 255, 255));
        jText_precio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jText_precio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jText_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 230, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 110, 70));

        jButton5.setText("Regresar ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int  validacion= 0;
        String  nombre ,dosis, descripcion, precio;
       
      
        nombre = jText_nomp.getText().trim();
        dosis = jText_cantidad.getText().trim();
        descripcion = jText_des.getText().trim();
        precio = jText_precio.getText().trim();
        
        
        if(nombre.equals("")){
            jText_nomp.setBackground(Color.red);
            validacion ++;
        }
        if(dosis.equals("")){
            jText_cantidad.setBackground(Color.red);
            validacion ++;
        }
        if(descripcion.equals("")){
            jText_des.setBackground(Color.red);
            validacion ++;
        }
        if(precio.equals("")){
            jText_precio.setBackground(Color.red);
            validacion ++;
        }
        try {
            Connection cnx = Conexion.conectar();
            PreparedStatement pst = cnx.prepareStatement(
            "select Producto_nombre from  productos where producto_nombre = '" + nombre + "'" );
           
                    
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                jText_nomp.setBackground(Color.red);
                
                JOptionPane.showMessageDialog(null, "!!!!!Datos con coincidencia con otro producto ,  agrege otro nombre!!!");
                cnx.close();
            }else{
             cnx.close(); 
             if(validacion == 0 ){
                 try {
                     Connection cnx2 = Conexion.conectar();
                     PreparedStatement pst2 = cnx2.prepareStatement(
                     "insert into productos values (?,?,?,?,?)");
                     pst2.setInt(1, 0);
                     pst2.setString(2, nombre);
                     pst2.setString(3, dosis);
                     pst2.setString(4, descripcion);
                     pst2.setString(5, precio);
                     
                     
                   
                     pst2.executeUpdate();
                     cnx2.close();
                     
                     Limpiar();
                     
                     jText_nomp.setBackground(Color.green);
                     jText_cantidad.setBackground(Color.green);
                     jText_des.setBackground(Color.green);
                     jText_precio.setBackground(Color.green);
                       JOptionPane.showMessageDialog(null, "Registro exitoso ");
                    
                 } catch (SQLException e) {
                     JOptionPane.showMessageDialog(null, "Error del sistema");
                 }
             }else {
                 JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                 
             }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de sistema  ");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField jText_cantidad;
    private javax.swing.JTextField jText_des;
    private javax.swing.JTextField jText_nomp;
    private javax.swing.JTextField jText_precio;
    // End of variables declaration//GEN-END:variables

public void Limpiar(){
   
    jText_cantidad.setText("");
    jText_des.setText("");
    jText_nomp.setText("");
    jText_precio.setText("");
}
}



package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author equipo2
 */
public class Login extends javax.swing.JFrame {
    
    public static  String user = "";
    String pass = "";
    
    

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(400,600);
        setResizable(false);
        setTitle("Aceso al sistema");
        setLocationRelativeTo(null);
        
        
        
        ImageIcon wallpapper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon Icono = new ImageIcon(wallpapper.getImage().getScaledInstance(jLabel1_Wallpaper.getWidth(),
                jLabel1_Wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jLabel1_Wallpaper.setIcon(Icono);
        this.repaint();
        
        
        ImageIcon wallpapper_logo = new ImageIcon("src/images/farmacia.png");
         Icon Icono_logo = new ImageIcon(wallpapper_logo.getImage().getScaledInstance(jLabel_logo.getWidth(),
         jLabel_logo.getHeight(),Image.SCALE_DEFAULT));
         jLabel_logo.setIcon(Icono_logo);
         this.repaint();
               
    }

   @Override
   public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/farmacia.png"));
       return retValue;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel_logo = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_acceder = new javax.swing.JButton();
        jButton_acceder1 = new javax.swing.JButton();
        jLabel1_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 270));

        txt_user.setBackground(new java.awt.Color(153, 153, 255));
        txt_user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, 30));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 370, 210, -1));

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 70, -1));

        jButton_acceder.setBackground(new java.awt.Color(153, 153, 255));
        jButton_acceder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_acceder.setText("Inicio");
        jButton_acceder.setBorder(null);
        jButton_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_accederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 420, 210, 35));

        jButton_acceder1.setBackground(new java.awt.Color(153, 153, 255));
        jButton_acceder1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_acceder1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_acceder1.setText("Registrar ");
        jButton_acceder1.setBorder(null);
        jButton_acceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_acceder1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_acceder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 220, 35));
        getContentPane().add(jLabel1_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jButton_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_accederActionPerformed
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();
        
        if(!user.equals("")||!pass.equals("")){
            try{
              Connection cnx = Conexion.conectar();
              PreparedStatement pst = cnx.prepareStatement(
              "select tipo_nivel, estatus from usuarios where username = '"+ user
                + " 'and password = '"+pass + "'");
              ResultSet rs =  pst.executeQuery();
              if(rs.next()){
                  String tipo_nivel = rs.getString("tipo_nivel");
                  String estatus = rs.getString("estatus");
                  if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                      dispose();
                      new Interfaz().setVisible(true);
                  } else if(tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")) { 
                     dispose(); 
                       new Interfaz().setVisible(true);
                  } else if(tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")){
                   dispose();   
                           new Interfaz().setVisible(true);
                  }
                  
              }else{
               JOptionPane.showMessageDialog(null, "Datos de acceso incorrecto.  "); 
               txt_user.setText("");
               txt_password.setText("");
              }
            }catch (SQLException e ){
                JOptionPane.showMessageDialog(null, "!! Error al iniciar sesion contacte con el administrador !!! ");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos. ");
            
        }
    }//GEN-LAST:event_jButton_accederActionPerformed

    private void jButton_acceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_acceder1ActionPerformed
     Registro registraru = new Registro();
    registraru.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton_acceder1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_acceder;
    private javax.swing.JButton jButton_acceder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Wallpaper;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

 


}

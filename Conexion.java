
package clases;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author edype
 */
public class Conexion {
        public static Connection conectar(){
            
 
            try {
                
               Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
                       return cnx;
               
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error en la conexion a la base de datos");
            }
        return (null);
    } 
        
    
}

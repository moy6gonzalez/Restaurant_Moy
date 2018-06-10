import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Logica_Acceso  extends javax.swing.JFrame implements ActionListener {
    
    private JTextField usuario;
    private JPasswordField password;
    private JButton verifica;
    
public Logica_Acceso(JTextField usuario, JPasswordField password ,JButton verifica)  {
    this.password=password;
    this.usuario=usuario;
    this.verifica=verifica;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                   
        Base_Datos_Restaurant  cbd= new Base_Datos_Restaurant();
        cbd.setBd("test");
        cbd.setHost("localhost");
        cbd.setPuerto("3306");
        cbd.setUsuario("root");
        cbd.setContrasena("moyeschido");
        
        Connection con = null;
        
        if( cbd.ObtenCadenaConexion()==null){
        
            System.out.println("Error en conexion D:");
        }//if1
        else{
    //           System.out.println("Todo Fine "+cbd.ObtenCadenaConexion());
               con = cbd.obtenConexion();
               if(con==null) {
                   System.out.println("Tenemos un error D:");
           }//if2
               else{
                   String resultado = cbd.EjecutaSQL("SELECT  Puesto, Contrasenia FROM usuario where Id_Usuario='"+usuario.getText()+"';");
                  // String contrasenia = cbd.EjecutaSQL("SELECT Contrasenia FROM usuario where Puesto='Administrador';");
                   if (resultado==null) {
                       System.out.println("Error al ejecutar consulta");
                   }//if3
                   else{
                       System.out.println(resultado);
                       
                     String contrasenia = null;
                       contrasenia=resultado.substring(resultado.lastIndexOf(";")+1);
                       System.out.println(contrasenia);
                       
                      //  System.out.println(contrasenia);
                   
                       if(contrasenia.compareTo(password.getText())==0)
                        {
                            String perfil=resultado.substring(0,resultado.lastIndexOf(";"));
                            System.out.println(perfil);
                             OPCIONES op = new OPCIONES(perfil,usuario.getText());
                               op.setVisible(true);
                               op.setLocationRelativeTo(null);
                               this.dispose();       
                        }
                        else {
                             JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique nuevamente.");
                        }
                   }//else                  
               }//else
           }//else        
    }
}
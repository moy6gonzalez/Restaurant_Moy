import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import java.sql.Statement;
import javax.swing.JOptionPane;


public abstract class Logica_Mesas extends javax.swing.JFrame implements ActionListener{
    
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton27;
    private JButton jButton28;
    private JButton jButton29;
    private JButton jButton3;
    private JButton jButton31;
    private JButton jButton33;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    
    
    
    public Logica_Mesas(JButton jButton1,JButton jButton10, JButton jButton11,JButton jButton12, JButton jButton13,JButton jButton14, JButton jButton15,
JButton jButton16,
    JButton jButton17,
     JButton jButton18,
   JButton jButton19,
     JButton jButton2,
    JButton jButton20,
     JButton jButton21,
     JButton jButton22,
     JButton jButton23,
     JButton jButton24,
     JButton jButton25,
     JButton jButton26,
     JButton jButton27,
     JButton jButton28,
     JButton jButton29, JButton jButton3, JButton jButton31, JButton jButton33, JButton jButton4, JButton jButton5, JButton jButton6, JButton jButton7,
     JButton jButton8, JButton jButton9){
        this.jButton1=jButton1;
        this.jButton9=jButton9;
        this.jButton10=jButton10;
        this.jButton11=jButton11;
        this.jButton12=jButton12;
        this.jButton13=jButton13;
        this.jButton14=jButton14;
        this.jButton15=jButton14;
        this.jButton16=jButton15;
        this.jButton17=jButton17;
        this.jButton18=jButton18;
        this.jButton19=jButton19;
        this.jButton2=jButton2;
        this.jButton20=jButton20;
        this.jButton21=jButton21;
        this.jButton22=jButton22;
        this.jButton23=jButton23;
        this.jButton24=jButton24;
        this.jButton25=jButton25;
        this.jButton26=jButton26;
        this.jButton27=jButton27;
        this.jButton28=jButton28;
        this.jButton29=jButton29;
        this.jButton3=jButton3;
        this.jButton31=jButton31;
        this.jButton33=jButton33;
        this.jButton4=jButton4;
        this.jButton5=jButton5;
        this.jButton6=jButton6;
        this.jButton7=jButton7;
        this.jButton8=jButton8;
        
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
                   String resultado = cbd.EjecutaSQL("SELECT  Id_Mesa,Capacidad_Mesa,Disponibilidad from mesa where Disponibilidad='Libre';");
                  // String contrasenia = cbd.EjecutaSQL("SELECT Contrasenia FROM usuario where Puesto='Administrador';");
                   if (resultado==null) {
                       System.out.println("Error al ejecutar consulta");
                   }//if3
                   else{
                       System.out.println(resultado);
                       
                   
                       
                      //  System.out.println(contrasenia);
                   
                    /*   if()
                        {
                            String perfil=resultado.substring(0,resultado.lastIndexOf(";"));
                            System.out.println(perfil);
                                   menu a= new menu();
                                   a.setVisible(true);
                                   this.setVisible(false);        // TODO add your handling code here:
     
                        }
                        else {
                             JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique nuevamente.");
                        }*/
                   }//else                  
               }//else
           }//else        
    }

}


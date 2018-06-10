import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
  @author Moises Gonzalez
 */
public class Base_Datos_Restaurant{

      private  String bd;
      private  String puerto;
      private  String host;
      private  String cadenaConexion;
      private  String usuario;
      private  String contrasena;
        
      private  Connection conn = null;
      private  Statement st = null;
      private  ResultSet rs = null;

    public void setBd(String bd) {
        this.bd = bd;
    }
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String ObtenCadenaConexion() {
        if (this.host!=null && this.puerto !=null && this.bd!=null) {
            this.cadenaConexion="jdbc:mariadb://"+this.host+":"+this.puerto+"/"+this.bd;
        return this.cadenaConexion;
        }
        return null;
    }
    public Connection obtenConexion(){
        try{
            conn = DriverManager.getConnection(this.cadenaConexion,this.usuario,this.contrasena);
        }
        catch(SQLException ex){
            conn = null;
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    public String EjecutaSQL(String instruccion){
        String cadenaSalida= ""; 
        try{
                     st = conn.createStatement();
                    
                     rs = st.executeQuery(instruccion);
                     
                     int max=0;
                     try{
                         rs.next();
                         for (max = 1; ; max++) {
                             rs.getString(max);
                         }//for
                     }//try
                     catch(SQLException ex){
                         System.out.println(max-1);
                         max=max-1;
                     }//catch
                     
                    do{
                        for (int i = 1; i <=max; i++) {
                              cadenaSalida+= rs.getString(i)+";";
                            
                        }
                        cadenaSalida += "|";
                    } while(rs.next());
                }catch(SQLException ex){
                    cadenaSalida= null;
                            System.out.println(ex.getMessage());
                }
        cadenaSalida=cadenaSalida.replace(";|", "|");
        cadenaSalida=cadenaSalida.substring(0,cadenaSalida.length()-1);      
        return cadenaSalida;
    }
}
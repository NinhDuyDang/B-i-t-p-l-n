
package ktpm;
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CN {
    public static Connection getConnection(){
        Connection cn = null;
        
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databasename=QLCovid";
                String uer = "sa";
                String pass ="18";
                cn = DriverManager.getConnection(url,uer,pass);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CN.class.getName()).log(Level.SEVERE, null, ex);
            }
    
            
            
        
    
    
    


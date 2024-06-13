
package codes;

//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class BDconnect {
    public static Connection connect(){
        
        Connection conn= null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/testapp01";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            //conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testapp01","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
    }
}

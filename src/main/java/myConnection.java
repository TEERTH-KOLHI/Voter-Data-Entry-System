
import java.sql.*;
import javax.swing.JOptionPane;
public class myConnection {
    
    public static Connection getConnection(){ 
        Connection connection= null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voter","root","root");
           return connection;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error 404.");
        } 
        
        return connection;
    }
}

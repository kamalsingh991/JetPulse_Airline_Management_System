
package jetpulse;
import java.sql.*;





public class Conn {
    
    private static Connection c;
    // Statement s;
   
    
    public static Connection getConnection()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jetpulse","root","Kamal802208@");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return c;
    }
    
    
}


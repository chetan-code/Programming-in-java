/**
 * Example of a basic connection of application with 
 * mysql database using jdbc driver
 */
//import sql
import java.sql.*;

public class Connect
{
    public static void main (String args[]){
        
        Connection conn = null;
        
        try{
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //start connection
            conn = DriverManager.getConnection(url, username, password);
            
            System.out.println("Database connection established");
                  
        }
        catch(Exception e){
            System.err.println("Cannot connect to databse server :" + e);
        }
        
        finally{
            if(conn != null){
                
                try{
                    conn.close();//closing connection
                    System.out.println("DB conncetion terminated");
                }
                catch(Exception e){
                 //ignore
                }
            }
        
        }
        
    
    }
}

/**
 * Drop the table
 */
//import sql
import java.sql.*;

public class DropTable
{
    public static void main (String args[]){
        Connection conn = null;
        Statement stmt = null;
        
        try{
        
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //connncetion established
            conn = DriverManager.getConnection(url,username,password);
            //create statement 
            stmt = conn.createStatement();
            //insert record in javacourse
            stmt.execute("drop table javacourse");  
        }catch(SQLException e){
            message(e.toString());
            message("SQLState : " + e.getSQLState());
        }
        catch(Exception e){
            message(e.toString());
        }
        
    }
    
    static void message(String msg){
        System.out.println(msg);
    }
}
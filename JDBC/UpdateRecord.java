/**
 * Update the RECORD PRESENT IN TABLE
 */
//import sql
import java.sql.*;

public class UpdateRecord
{
    public static void main (String args[]){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String Tablename;
        
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
            stmt.execute("update javacourse set Name = 'Chetan Sharma' where Name ='Chetan'");  
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
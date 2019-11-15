/**
 * Create a table in mysql server using java
 */
//import sql
import java.sql.*;

public class CreateTable
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
            //creating table
            stmt.execute("create table JavaCourse(Roll Integer primary key, Name Varchar(30), Marks Integer not null, Grade Varchar(2))");        
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

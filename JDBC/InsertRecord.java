/**
 * Insert some dta in the table javacourse
 */
//import sql
import java.sql.*;

public class InsertRecord
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
            stmt.execute("insert into javacourse values(01,'Chetan', 70, 'B')");
            //more data - primary key should be diffrebt for all
            stmt.execute("insert into javacourse values(02,'Pratik', 90, 'A')");
            stmt.execute("insert into javacourse values(03,'Abhishek', 65, 'C')");
            stmt.execute("insert into javacourse values(04,'Arohi', 99, 'EX')");  
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
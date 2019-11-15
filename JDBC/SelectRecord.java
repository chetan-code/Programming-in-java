/**
 * Reading records from the table
 */

import java.sql.*;

public class SelectRecord
{
    public static void main (String args[]){
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        int TotalMarks = 0;
        int NumStudent = 0;
        float AvgMarks;
        
        String NameString, RollString, MarksString, GradeString;
        
        try{
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //start connection
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            stmt.execute("select * from javacourse");
            rs = stmt.getResultSet();
            System.out.println("\n\n ---------- Result ------- \n");
            
            while(rs.next()){
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                TotalMarks = TotalMarks + Integer.parseInt(MarksString);
                System.out.println("Name: = " + NameString +
                "\t\t" + "Roll : = " + RollString +
                "\t\t" + "Marks : = " + MarksString +
                "\t\t" + "Grade : = " + GradeString + "\n");
            }
            
            rs.last();
            NumStudent = rs.getRow();
            AvgMarks = TotalMarks / NumStudent;
            System.out.println("\n\n-------AVG MARKS = " + AvgMarks + "-------");
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        finally{
            if(rs != null){
             try{
                rs.close();
                }catch(Exception e){
                    //ignore
                }
            }
        }
        
    
    }
}

/**
 * simple url class and using it method to get info about url
 */

//import statements for networking
import java.io.*;
import java.net.*;


public class URLClass
{
  public static void main (String args[]){
    
      try{
          URL url = new URL("https://nptel.ac.in/course.php");
          
          //using different maethod of class on the url object
          System.out.println("Protocol : " + url.getProtocol());//http
          System.out.println("Hos name :" + url.getHost());//nptel.ac.in
          System.out.println("Port No :" + url.getPort());//-1 is default
          System.out.print("File name :" + url.getFile());///couse.php          
          
        }catch(Exception e){
           System.out.print(e);
        }
      
    }
}

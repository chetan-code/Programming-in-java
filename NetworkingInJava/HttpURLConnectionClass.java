/**
 * JUst like urlconnnection only requirement is the protocol used is http
 */

import java.io.*;
import java.net.*;

public class HttpURLConnectionClass
{
    
    public static void main(String args[]){
        
        try{
            //url obj
            URL url = new URL("https://nptel.ac.in/course.html");
            //https obj
            HttpURLConnection huc =(HttpURLConnection)url.openConnection();//open connection
            //reading data
            for(int i =1; i <= 8; i++){
             System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
            huc.disconnect();//disconnect
        }catch(Exception e){
         System.out.print(e);
        }
        
    }
}

/**
 * UrlConnection - to establish a connection with a specified url * 
 */

import java.io.*;
import java.net.*;


public class URLConnectionClass
{

    public static void main (String args[]){
    
        try{
            //url
            URL url = new URL("https://nptel.ac.in/course.html");
            //url conncetion form url
            URLConnection urlcon = url.openConnection();//conncetion open
            //input stream frm url conncetion
            InputStream stream = urlcon.getInputStream();
            int i;
            //read till we dont reach eand of file
            while((i = stream.read()) != -1){
                System.out.print((char)i);//this will print whole file
            }
        }catch(Exception e){
                System.out.print(e);
        }
    
    }
}

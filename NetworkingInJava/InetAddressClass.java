/**
 * Inet is like url but just the main domain name
 * we can get info with this class about url/inet adress
 */

import java.io.*;
import java.net.*;

public class InetAddressClass
{
    
    public static void main(String args[]){
    
        try{
            InetAddress ip = InetAddress.getByName("www.nptel.ac.in");//just domain name
             System.out.println("Host Name : " + ip.getHostName()
             + "\n" + "IP Address : " + ip.getHostAddress() 
             );
        }catch(Exception e){
            System.out.print(e);
        }
    
    }
}

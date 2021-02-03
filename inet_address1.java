import java.io.*;
import java.net.*;
public class inet_address1 {
    public static void main(String[] args ){
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host name :- "+ip.getHostName());
            System.out.println("Ip address:- "+ip.getHostAddress());

        }catch(Exception e){System.out.println(e);}
        
    }
    
}
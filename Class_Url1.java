import java.net.*;
public class Class_Url1 {
    public static void main(String[] aergs ){
        try{
            URL url = new URL("http://WWW.google.com");
            System.out.println("Protocol : -" +url.getProtocol());
            System.out.println("Host name :- "+url.getHost());
            System.out.println("Port number "+ url.getPort());
            System.out.println("File name " +url.getFile());
            System.out.println("Default port :- " +url.getDefaultPort());

        }catch(Exception e ){System.out.println(e);}
    }
    
}
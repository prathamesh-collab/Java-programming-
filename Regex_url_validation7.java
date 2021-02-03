import java.net.URL;
public class Regex_url_validation7 {
    public static boolean isvalid(String url ){
        try{
            new URL(url).toURI();
            return true ;

        }
        catch(Exception e ) {
            return false ;

        }
    }
    public static void main(String[] args ){
        String url1 = "http://www.google.com/";
        if (isvalid(url1))
        System.out.println("yes");
        else
        System.out.println("No");
        String url2 = "http:// www.google.com/";
        if (isvalid(url2))
        System.out.println("yes");
        else
        System.out.println("No");
    }
    

    
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx3 {
    public static void main(String[] args ){
        // create a pttern to be searched 
        Pattern pattern = Pattern.compile("gee*");

        // search above pattern in geeksforgeeks.org 
        Matcher m = pattern.matcher("geeksforgeeks.org ");

        // print starting and ending indexes of the pattern in text 
        while(m.find())
        System.out.println("Pattern forn from " +m.start() + "to "+(m.end()-1));

    }
    
}
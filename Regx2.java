import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  
public class Regx2 {
 
    public static void main(String args[]) 
    { 
        // Create a pattern to be searched 
        Pattern pattern = Pattern.compile("org"); 
  
        // Search above pattern in "geeksforgeeks.org" 
        Matcher m = pattern.matcher("geeksforgeeks.org"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        if (m.find()){


            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1) );
        }else{
            System.out.println("not found ");
        }
    }
}


//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx_split4 {
    public static void main(String[] args ){
        String text  = "geeks1for2geeks3";

        // Specifies the string pattern which is to be searched 
        String delimitr = "\\d";
        Pattern p = Pattern.compile(delimitr , Pattern.CASE_INSENSITIVE);

        String [] result = p.split(text);

        for(String  temp  : result )
        System.out.println(temp);

        

    }
    
}
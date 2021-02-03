import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Email_pattern8 {
    public static boolean isvalid(String email){
        String emailregex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
        "[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
        "A-Z]{2,7}$"; 
          ;
        Pattern p = Pattern.compile(emailregex);
        if (email == null)
        return false;
        return p.matcher(email).matches();

    }
    public static void main(String[] args ){
        String email = "contr@grsdb.org";
        if (isvalid(email))
        System.out.println("yes");
        else
        System.out.println("no");

    }
    
}
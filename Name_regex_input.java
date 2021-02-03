import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Name_regex_input {
    public static boolean isvalid(String name ){
        String namereg = "^[A-Z][a-zA-Z\\s]*$";
        Pattern p = Pattern.compile(namereg);
        if (name == null)
        return false;
        return p.matcher(name).matches();


    }
    public static void main(String[] args ){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = n.nextLine();
        if (isvalid(name))
        System.out.println("valid ");
        else
        System.out.println("Invalid name ");



    }
    
}
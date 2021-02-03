import java.util.regex.*;
import java.util.Scanner;

public class Regex_input_mobile {
    public static boolean isvalid(String s){
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));

    }
    public static void main(String[] args ){
        
        Scanner l = new Scanner(System.in);
        System.out.println("Enetr mobile number here :- ");
        String s  = l.nextLine();
        if (isvalid(s))
        System.out.println("VAlid mobile number ");
        else 
        System.out.println("Invalid mobile number ");
        


    }
    
}
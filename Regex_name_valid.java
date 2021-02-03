import java.util.regex.*;
import java.util.Scanner;

public class Regex_name_valid {
    public static boolean isvalid(String s){
        Pattern p = Pattern.compile("^[A-Z][a-zA-Z\\s]*$");

        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));

    }
    public static void main(String[] args ){
        String s = "prathamesh awnat santosh";

        if (isvalid(s))
        System.out.println("valid name ");
        else
        System.out.println("Invalid name ");

    }
    
}
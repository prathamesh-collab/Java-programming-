//this class is used to get input from console its provide  method to read text and password 
//Console example to read password 

import java.io.Console;

public class Console_class {
    public static void main(String[] args ){
        Console c = System.console();
        System.out.println("Enter password ");
        char[] ch = c.readPassword();  
        String pass = String.valueOf(ch) ;    // converting char array into string 
        System.out.println("Password is :- "+pass);
        
    }

    
}
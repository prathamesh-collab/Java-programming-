import java.util.regex.*;

import javax.lang.model.util.ElementScanner6;

import java.util.Scanner;

public class Name_mobile_email {
    public static boolean isvalid(String n){
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
      
        Matcher m = p.matcher(n);
        return (m.find() && m.group().equals(n));
    }
    public static boolean isva(String s ){
        Pattern p = Pattern.compile("^[A-Z][a-zA-Z\\s]*$");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));


    }
    public static boolean isv(String email){
        Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
        "[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
        "A-Z]{2,7}$");
        Matcher m = p.matcher(email);
        return (m.find() && m.group().equals(email));


    }
    public static void main(String[]  args ){
        Scanner r = new Scanner(System.in);
        int  choice ;
        System.out.println("************Welcome to check-poit******************");
        System.out.println(" ");
        System.out.println("1:-mobile");
        System.out.println("2:-Name ");
        System.out.println("3:- Email_ID");
        System.out.println("Enter your choice ");
        choice = r.nextInt();
        if (choice == 1){
            System.out.println("Enter mobile number here :- ");
            String n = r.nextLine();

           
            if (isvalid(n))
            System.out.println("valid mobile number ");
            else 
            System.out.println("invalid ");
            

        }else if (choice == 2){
            System.out.println("Enter name here :- ");
            String s = r.nextLine();
            isva(s);
        }else if (choice == 3){
            System.out.println("Enetr Email_ID here :- ");
            String email = r.nextLine();
            isv(email);

        }else {
            System.out.println("Invalid input ");
        }
        
    }

    }
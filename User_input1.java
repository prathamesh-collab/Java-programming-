import java.util.Scanner;

public class User_input1 {
    public static void main(String[] args ){
        Scanner obj = new Scanner(System.in); // create a scannner object 
        System.out.println("Enter user name here :- ");
        String username = obj.nextLine();    // read user input 
        System.out.println("username  :-" + username);
        
    }
    
}
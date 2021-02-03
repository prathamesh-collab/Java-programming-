// takaing input from user by using built in package : Scanner class
import java.util.Scanner;

public class User_input28 {
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr your name here");
        String fname = s.nextLine();
        System.out.println("Enter your age here ");
        int age = s.nextInt();
        System.out.println("your name is " + fname+ " and your age is "+age );

    }

    
}
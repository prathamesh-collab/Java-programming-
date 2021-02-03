import  java.util.Scanner;


public class User_input2 {
    public static void main(String[] args ){
        
        System.out.println("Enter your first name here :- ");
        Scanner obj = new Scanner(System.in);
        String username = obj.nextLine();

    
        System.out.println("Enetr your mobile no  here :- ");
        Scanner obj2 = new Scanner(System.in );
        long mob = obj2.nextLong();



        

        System.out.println("your usernme is :- " +username + "and mobile no is :- " +mob);

    }
    
}
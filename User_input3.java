import java.util.Scanner;
public class User_input3 {
    public static void main(String[] args ){
    
        Scanner obj = new Scanner(System.in);
        
        String s = obj.nextLine();
        System.out.println("You enterd String " + s);
        int a = obj.nextInt();
        System.out.println("you enterd integer "+ a);
        float b = obj.nextFloat();
        System.out.println("you enterd float " +b) ;


    }
    
}
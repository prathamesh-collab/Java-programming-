import java.util.Scanner;
public class Calculator_switch1 {
    public static void add(int a , int b){
        System.out.println(a+b);
    }
    public static void sub(int a , int b ){
        System.out.println(a-b);

    }



    
    public static void main(String[] args ){
        int a;
        int b;
        int choice ;
        int l = 0;
        while(l==0){

            System.out.println("Welcome to calculator ........");
            System.out.println("1:-Addition ");
            System.out.println("2:-Subtraction .........");
            System.out.println("3:- Exit");
            System.out.println(" ");
            Scanner c = new Scanner(System.in);
            System.out.println("Enter your choice here ");

            choice = c.nextInt();
            System.out.println("Enetr 1st number here :- ");
            a = c.nextInt();
            System.out.println("Enetr 2nd number her :- ");
            b = c.nextInt();
            switch (choice){
                case 1:
                add(a,b);
                break;
                case 2:
                sub(a, b);
                break;
                case 3:
                l = 1;
                break;
                default:
                System.out.println("you enter wrong input ");
                

            } 




        }
    }
}





        
    
    

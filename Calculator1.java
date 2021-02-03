import java.util.Scanner;
public class Calculator1{
    static int add(int a , int b ){
        return a + b ;
        
    }
    static int sub(int a , int b ){
        return a - b ;


    }
    public static void main(String[] args ){
        int a;
        int b;
        int l = 0;

            
  
        int choice ;
        while (l== 0) {

            System.out.println("WElcome ");
            System.out.println("1:- Addition ");
            System.out.println("2:- Subtraction ");
            System.out.println("3 :- exit ");
            System.out.println(" ");
            Scanner ch = new Scanner(System.in);
            System.out.println(("Enetr your choice here :- "));
            choice = ch.nextInt();
            System.out.println("Enetr 1st number :- " );
            a = ch.nextInt();
            System.out.println("Enetr 2nd number :- ");
            b = ch.nextInt();

            if(choice == 1){
                System.out.println(add(a, b));

        

            }else if (choice == 2){
                System.out.println(sub(a, b));

            }else if ( choice == 3) {
                l = 1;
            }
        }



    }
}
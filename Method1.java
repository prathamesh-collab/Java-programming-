import java.util.Scanner; 
public class Method1 {
    static int sum(int a , int b ){
        return a + b ;

    }
    static int sub(int a , int b ){
        return a - b ;
         
    }
    public static void main(String[] args ){
        int a;
        int b;
        Scanner ch = new Scanner(System.in);

        System.out.println("enetr first number : -");
        a = ch.nextInt();
        System.out.println("Enter second number :- ");
        b = ch.nextInt();

        System.out.println(sum(a, b));
        System.out.println(sub(a, b));



    }
}


    
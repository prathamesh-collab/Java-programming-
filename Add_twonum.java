import java.util.Scanner;
public class Add_twonum {
    public static void main(String[] args ){
        int x , y ,sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Type a num ");
        x = obj.nextInt();
        System.out.println("Type another ");
        y=obj.nextInt();
        sum = x + y ;
        System.out.println(+x+ " + " +y+ " = "  +sum);

    }
    
}
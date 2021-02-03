
public class Method_overloding17 {
    public static int plus(int x , int y ){
        return x + y ;

    }
    public static double plus(double x , double y ){
        return x + y;

    }
    public static void main(String[] args) {
        System.out.println(plus(10, 10));
        System.out.println(plus(5.5, 1.5));

         
    }
    }
    

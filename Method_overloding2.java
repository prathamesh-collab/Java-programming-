class Adder{
    static int add(int a , int b ){
        return a +b ;

    }
    static double add(double a , double b ){
        return a+b;

    }
}
public class Method_overloding2 {
    public static void main(String[] args){
        System.out.println(Adder.add(10, 10));
        System.out.println(Adder.add(10.2, 12.3));


    }
    
}
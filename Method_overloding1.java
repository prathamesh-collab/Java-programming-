// Method Overloading : changing no. arguments 

class Adder{
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a , int b , int c){
        return a+b+c ;

    }
}
public class Method_overloding1 {
    public static void main(String[] args){
        System.out.println(Adder.add(12, 12));
        System.out.println(Adder.add(10, 10, 10));

    }
    
}
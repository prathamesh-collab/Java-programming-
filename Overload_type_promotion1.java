// one type is promoted to another implicity if no matching datatype is found


public class Overload_type_promotion1 {
    void sum(int a , long b){
        System.out.println(a+b);
    }
    void sum(int a , int b , int c ){
        System.out.println(a+b+c);
    }
    public static void main(String[] args ){
        Overload_type_promotion1 obj = new Overload_type_promotion1();
        obj.sum(20, 20);
        obj.sum(20, 20, 20);
    }


    
}
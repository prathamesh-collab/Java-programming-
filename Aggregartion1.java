class Operation{
    int squre(int n ){
        return n * n ;

    }
}
class circle{
    Operation op ;   // aggregation
    double pi = 3.14 ;
    
    double area(int radius){
        op = new Operation();
        int rsquare= op.squre(radius); //code reusability (i.e delegates the methd call)
        return pi * rsquare;

    }
}

public class Aggregartion1 {
    public static void main(String[] args){
        circle c = new circle();
        double result = c.area(5);
        System.out.print(result);
    }

    
}
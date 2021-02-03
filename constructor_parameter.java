public class constructor_parameter {
    int x;
    public constructor_parameter(int y ) {
        x = y ;

    }
    public static void main(String[] args ){
        constructor_parameter myobj = new constructor_parameter(5);
        System.out.println(myobj.x);
        
    }
    
}
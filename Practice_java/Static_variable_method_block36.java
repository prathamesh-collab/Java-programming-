class test{
    //Static variable 
    static int a = m1();

    static{
        System.out.println("inside static block ");
    }
    static int m1(){
        System.out.println("from m1");
        return 20 ;

    }



}
public class Static_variable_method_block36 {
    public static void main(String[] args ){
        System.out.println("value of " +a );
        System.out.println("from main");
    }
    
}
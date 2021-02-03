// execution of static variable and static block 

public class static_variable {
    //static variable
    static int a = m1();
    // static block
    static {
        System.out.println("inside static block");
    } 
    // static method 
    static int m1() {
        System.out.println("from m1 ");
        return 20;

    }
    // static main method 
    public static void main(String[] args ){
        System.out.println("value of a: "+a);
        System.out.println("from main");
    }
}

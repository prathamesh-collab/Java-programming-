public class static_block_example {
    // static variable
    static int a =10;
    static int b;
    //static block
    static {
        System.out.println("Static block initialized ");
        b = a * 4;
    }
    public static void main(String[] args){
        System.out.println("from main");
        System.out.println("value of a : - " +a);
        System.out.println("values of b :-" +b);
    }
    
}
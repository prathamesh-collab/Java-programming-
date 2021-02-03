// Autoboxing example of int to integer 
public class Wrapper_class1 {
    public static void main(String[] args){
        int a = 20;
        Integer i = Integer.valueOf(a);    // converting int into integre explicity
        Integer j = a; // Autoboxing now 
        System.out.println(a+" "+i+" "+j);
        
    }
    
}
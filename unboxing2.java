
//unboxing example
// the automatic conversion of wrapper type into its corresponding primitive type is know as unboxing 
// its a reverse process of Autoboxing 

public class unboxing2 {
    public static void main(String[] args){
        // converting integer to int 
        Integer a = new Integer(3);
        int i = a.intValue(); // converting Integer to int explicity
        int j = a; // unboxing now compiler will write a.intValue() internally
        System.out.println(a+" "+i+" "+j );
        
    }
    
}
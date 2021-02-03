// Example of method overloding with type promotion if matching found
// if there are matching type arguments in the method , type promotion is no performed

public class Overloding_type_promotion2 {
    void sum(int a, int b){
        System.out.println("int args method is found here ");

    }
    void sum(Double  a , Double b ){
        System.out.println("double  methos is found here ");

    }
    public static void main(String[] args){
        Overloding_type_promotion2 obj = new Overloding_type_promotion2();
        obj.sum(20, 20); 


    }
    
}
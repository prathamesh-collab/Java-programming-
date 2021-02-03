// Typecasting :- changing one data type to another data type is called typecasting :-
// widening casting :- small data type to larger data type / casting is done automatically 
// narrowing casting :- larger to small // casting is done manually :- 



public class Typecasting2 {
    public static void main(String[] args ){
        int p = 56;
        double d = p; // widening casting int to double 
        System.out.println(p);
        System.out.println(d);

        // narrowing casting :- 

        double r = 9.87;
        int m = (int) r ; // manual casting double to int :- 
        System.out.println(r);
        System.out.println(m);

    }
    
}
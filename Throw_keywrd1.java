// throw statement is allow you to create a custom error 

// this will throw custom error if the age is under 18 
public class Throw_keywrd1 {
    static void checkage(int age ){
        if (age < 18 ){
            throw new ArithmeticException("Acces denied - u must be at least 18 yrs old ");

        } 
        else {
            System.out.println("ACces granted - you are old enough ");

        }
    }
    public static void main(String[] args ){
        checkage(15);                
    }

    
}
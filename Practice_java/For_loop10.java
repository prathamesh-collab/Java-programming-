

// For_loop :-when you know exactly how many times you want to loop through a block of code , use for loop instead 
// of while loop  

public class For_loop10 {
    public static void main(String[] args ){
        for(int i=0 ; i < 5; i++ ) {
            System.out.println(i);
        }
        // for loop is also using to iterat the elemets 
        String[] cars = {"Volvo","BMW"} ;
        for(String  element : cars){
            System.out.println(element);
        }
        


    }
    
}
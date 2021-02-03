// built in array :- we cannot modified the array .. 
// in arraylist we can add and remove wherever we want 
import java.util.ArrayList;

public class Arraylist_eg1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("Befor changing the array :- " +cars);
        System.out.println("i want to change the value of "  + cars.get(0)+ " car ");
        cars.set(0, "opel");
        System.out.println("After changing the array :- "+ cars);
        System.out.println("Want to check size of array  :- " +cars.size());
        System.out.println("remove " +cars.get(1)+ " cars " +cars.remove(1));
        System.out.println(("After removing size is " +cars.size()));
 
        System.out.println("array is " + cars);




    }

    
}
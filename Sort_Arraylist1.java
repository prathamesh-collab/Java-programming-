import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Sort_Arraylist1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Abss");
        Collections.sort(cars);             // sort 
        for(String i : cars ) {
            System.out.println(i);
        }

    }
    
}
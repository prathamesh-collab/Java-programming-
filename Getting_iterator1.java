// An Iterator is an object that can be used to loop through coolection 
import java.util.ArrayList;
import java.util.Iterator;
public class Getting_iterator1 {
    public static void main(String[] args ){
        // make a collection :- 
        ArrayList<String> cars = new ArrayList<String >();
        cars.add("Volvo");
        cars.add("BMW ");

        // Get the iterator 
        Iterator<String> it = cars.iterator();

        // loop through a collection 
        while(it.hasNext() ) {
            System.out.println(it.next());
        }

        
            
        }
    }
    

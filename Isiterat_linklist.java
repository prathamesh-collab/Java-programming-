import java.util.LinkedList;
import java.util.ListIterator;
public class Isiterat_linklist {
    public static void main(String[] args ){
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("cat");
        animals.add("horse");

        ListIterator<String> list1  = animals.listIterator();
        System.out.println("LinkedList ");
        while(list1.hasNext()){
            System.out.println(list1.next());
            System.out.println(", ");
        }

        // iterate Backword 
        while(list1.hasPrevious()){
            System.out.println(list1.previous());
            System.out.println(", ");

            // check if the dog is in the linklist :- 
            

        }

        }
    }
    

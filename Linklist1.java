// Add elements using an index number :- 
import java.util.LinkedList;

public class Linklist1 {
    public static void main(String[] args ){
        LinkedList<String> animals = new LinkedList<>();
        animals.add(0,"Dog");
        animals.add(1,"Cat");
        animals.add(2,"Horse ");

        System.out.println("Linkedlist :- " + animals);

        // creating another linkedlist 
        LinkedList<String>  mammls = new LinkedList<>();
        mammls.add("crocodile ");

        // add all elements of animals into newly created mammls 
        mammls.addAll(animals);
        System.out.println( "mammls  :- " +mammls);

        //Acces the element :- 
        String str = animals.get(1);
        System.out.println( "Element at index from animal linklist :- " +str );

    }
    
}
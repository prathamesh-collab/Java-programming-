import java.util.PriorityQueue;
import java.util.Iterator;

public class Itrator_queue2 {
    public static void main(String[] args ){
        // creating priority Queue 
        PriorityQueue<Integer>  numbers  = new PriorityQueue<>();
        numbers.offer(4);
        numbers.offer(2);
        numbers.offer(1);
        System.out.println("PriorityQueue using iterator ( ) :- " );


        // using the iterator method : - 

        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            System.out.println(", ");
        }
    }
    
}
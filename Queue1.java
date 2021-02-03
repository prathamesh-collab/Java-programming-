//implementation of queue interface .. implementation of linkdlist class 
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args ){
        // creating Queue usimg the linkedlist class 
        Queue<Integer> numbers = new LinkedList<>();

        // insert  the element to the queue using offer :- 
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue " + numbers);

        // Access the element from the queue :- 
        int accesnumber = numbers.peek();        //peak is used to return the head of the queue 
        System.out.println("Accesed element :- " +accesnumber);

        //Remove elemet from the queue 
        int remove = numbers.poll();   // poll is used to remove head element and return null if queue is empty 
        System.out.println("REmove elemet is  :- " +remove);

        System.out.println("Update queue :- " +numbers );


    }
    
}
// implementation of Dqueue in ArrayDeque  Class 
import java.util.ArrayDeque;
import java.util.Deque;
public class Dqueue1 {
    public static void main(String[] args ){
        // creating Deque using the ArrayDeque Class 
        Deque<Integer> numbers =  new ArrayDeque<>() ;
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Deque " +numbers);

        //Access elements of the Deque 
        int firstelement = numbers.peekFirst();
        System.out.println("First element : " +firstelement);

        int lastelement = numbers.peekLast();
        System.out.println("Last element is :- " +lastelement);

        int removed = numbers.pollFirst();
        System.out.println("Remove first element :-  " +removed) ;

        int remov = numbers.pollLast();
        System.out.println("Remove Last element :- " +remov);
        System.out.println("Update Deque :- " +numbers);
        


       }


}
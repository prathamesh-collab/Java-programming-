import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_remove1 {
    public static void main(String[] args ){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(8);
        num.add(2);
        num.add(23);
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if(i<10){
                it.remove();
            }
        }
        System.out.println(num);
        

    }
    
}
// lamda expression can be store in variables if the variables type is an inerfaces which has only one method 
import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda_consumer2 {
    public static void main(String[] args ){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(9);
        num.add(8);
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        num.forEach(method);
    }

    
}
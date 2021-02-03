// Array are used to store the multiplae values in single variable , instaed of declaring separete variable 

public class Array12 {
    public static void main(String[] args){
        String[] cars = {"Volvo","BMW","mrsc"};
        int[] num = {1,5,8,12};

        System.out.println(cars);
        System.out.println(num);

        cars[0] = "opel ";
        System.out.println(cars[0]);
        System.out.println(cars.length);

// loop through an array with for-each loop 
        for(String p :cars){
            System.out.println(p);
        }

        for(int i = 0; i<num.length; i++){
            System.out.println(cars[i]);
        }

    }
    
}
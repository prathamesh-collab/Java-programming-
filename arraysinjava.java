public class arraysinjava {
    public static void main(String[] args){

        // to declare the string Array 
        String[] cars = {"VOlovo","BMW","Irtica"};
        System.out.println(cars);

        //to print the array length
        System.out.println("the length of the car : - "  +cars.length); 

        //refering to the index number 
        System.out.println(cars[0]);


        //itration of whole Array using for loop 
        for(String i  : cars ){
            System.out.println(i);

        }
    }
    
}
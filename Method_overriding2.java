class vehicle{
    void run(){System.out.println("vehical is running");}   // defining mathod 
}
class bike2 extends vehicle{
    // defining the same method as in the parent class
    void run(){System.out.println("Bike is running fast");}

}
public class Method_overriding2 {
    public static void main(String[] args ){
        bike2 obj = new bike2();   // creating object 
        obj.run();         // calling method 
         
    }
    
}

// in this example, we have define the run method in the subclass as same as we define in parent class 
//but it has some sepecific implementaion,
// yhe name and parameter of the method are same 
 
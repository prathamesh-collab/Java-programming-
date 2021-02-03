// constructor is the special method to intialize the object attribute 

public class Constructor_23 {
    int x;   // create a class attribute
    
    public Constructor_23(){    // create a class constructor // be sure that class name and constructor name is same
    x = 50 ; // set the initial value of attribute x 

    }

public static void main(String[] args ){
    Constructor_23 obj = new Constructor_23();
    System.out.println(obj.x);
    

}
    
}
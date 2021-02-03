// constructor : - 1 its used to intilize the object 2 :- constructor is called when the object  is created 3 : - it can be used to set the intilize the value of object  

// step 1:- creating a class with name constructor1
public class constructor1 {
    int x ;          // this is the class attribute
    
    // creating a class constructor for the constructor (class )
    public constructor1() {  // constructor1  is the construtor for created class whic is name is constructor1

        x = 5;       // set the intial value for class attribute x 
    }
 
    public static void main(String[] args){
        constructor1 myobj = new constructor1();    // create an object of class ( this will call the constructor )
        System.out.println(myobj.x);  // print the value of x     
    }
}
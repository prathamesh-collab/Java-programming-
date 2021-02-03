abstract class person {                    // abstract class 
    public String fname = "pratham";
    public int age = 24;
    public abstract void study();         // abstract method :- empty body  

     

}
// subclass (inherit from person ) 


class student extends person {
    public int grdyear = 20118;
    public void study(){              // the body of the abstract method is provided here 
        System.out.println("studying all day  long");

    }

}
public class myclass12 {
    public static void main(String[] args){               // main method 
        // create an object  of the student class (which inherits attributes and methods from person)
        student myobj = new student();

        System.out.println("name"+ myobj.fname);
        System.out.println("Age" + myobj.age);
        System.out.println("Graduationyear " + myobj.grdyear);
        myobj.study();          // call abstract method 
        

    }  

    
}
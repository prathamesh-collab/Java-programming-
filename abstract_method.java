abstract class person{

    public String fname = "john";
    public int age = 24;
    public abstract void study();

    
}
// subclass (inherint from upper class )
class student extends person {
    public int gradyear = 2018;
    public void study() { // the body of the abstract method is provide here 
        System.out.println("Studying all day long ");


    }
}
// end the code 


// code from  filename :- "myclass3.java

class myclass3 {
    public static void main(String[] args ){
        // create an object of the student class (which inherits attributes and methods from upper class ( abstrct_method.java) 
        student myobj = new student() ;
        System.out.println("name " +myobj.fname);
        System.out.println("Age" + myobj.age);
        System.out.println("graduation" +myobj.gradyear);
        myobj.study();    // call  abstract method 

    }
}
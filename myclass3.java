public class myclass3 {
    public static void main(String[] args) {
        // create an object of the student class (which inherits attributes and methods from "abstrct_method.java" file )
        student myobj = new student();
        System.out.println("name" +myobj.fname);
        System.out.println("Age" + myobj.age);
        System.out.println("gradution_year " +myobj.gradyear);
        myobj.study();    // call abstrct method 

    }
    
    
}
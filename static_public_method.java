public class static_public_method {

    //static method 
    static void myStaticmethod() {
        System.out.println("static method can be called without creating objects");

    }
    // public method
    public void myPublicmethod() {
        System.out.println("pblic methods must be called by creating objects");

    }
    //main  method 
    public static void main(String[] args){
        myStaticmethod();  // call the static method 
        // myPublicmethod();     // this would compile an error 

        static_public_method myobj = new static_public_method(); // creating object to acces the public method 
        myobj.myPublicmethod();
        

    }
    
}
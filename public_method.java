public class public_method {               
    public void bmw(){                  // creating public method 
        System.out.println("The car ig going as fast as it can");

    }
    public void speed(int maxspped) {         // creating public method with parameter 
        System.out.println("max speed is : " +maxspped);

    }
    // inside main call the methods on the mycar object 
    public static void main(String[] args){              //main method
        public_method mycar = new public_method();      //creating object for acces the public method 
        mycar.bmw();
        mycar.speed(200);
    }

    
}
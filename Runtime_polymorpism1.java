class Bike{  
    void run(){System.out.println("running");}  
  }  
  class Splendor extends Bike{  
    void run(){System.out.println("running safely with 60km");}  
  }

public class Runtime_polymorpism1{
    public static void main(String[] args){
        Bike b = new Splendor();
        b.run();

    }
}




    
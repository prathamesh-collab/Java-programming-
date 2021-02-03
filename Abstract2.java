// Abstract class 
abstract class Animal{
    //Abstract method (does not have a body)
    public abstract void animalsound();
    //Regular method
    public void sleep(){
        System.out.println("Zzzzzz");
    }
}
// subclass (inherint from Animal)
class pig extends Animal{
    public void animalsound(){
        // the body of abstract is provided here 
        System.out.println("the pig says : Weeeee Weeeee ");
    }
}

public class Abstract2 {
    public static void main(String[] args){
        pig mypig = new pig();
        mypig.animalsound();
        mypig.sleep();
    }
    
}
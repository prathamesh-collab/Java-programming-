//interface

interface Animal{
    public void animalsound();  //interface method :- does not have a body 
    public void run();     //interface method (does not have a body )

}
class pig implements Animal{
    public void animalsound(){
        // the body of animalsound is provided here 
        System.out.println("the pig says wee wee ");    
    }
    public void run(){
        // the body of run is provided here 
        System.out.println("XXXXXX");

}
}

public class Interface_example1 {
    public static void main(String[] args ){
        pig  mpig = new pig();
        mpig.animalsound();
        mpig.run();

    }
    
}
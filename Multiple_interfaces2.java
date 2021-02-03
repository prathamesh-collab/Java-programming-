// To implement multiple interfaces,seprate with them comma 
interface FirstInterface{
    public void myMethod();  // interface method 
}
interface SeconInterface{
    public void myanotheMethod();  // interface method 

}
class Democlass implements FirstInterface , SeconInterface{
    public void myMethod(){
        System.out.println("Some text.... ");

    }
    public void myanotheMethod(){
        System.out.println("Some another method ......");

    }
}

public class Multiple_interfaces2 {
    public static void main(String[] args ){
        Democlass myobj = new Democlass();
        myobj.myMethod();
        myobj.myanotheMethod();
    }
    
}
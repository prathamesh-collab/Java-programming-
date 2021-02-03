// this() : to invoke current class constructor
// the this() constructor call can be used to invoke the current class constructor . it is used to reuse the constructor
// in other words it is used for constructor chainging 

class A{
    A(){
        System.out.println("hello a"); 
    }
    A(int x){
        this();
        System.out.println(x);
    }
}
public class Test_this5 {
    public static void main(String[] args){
        A a = new A(10);
    }

    
}
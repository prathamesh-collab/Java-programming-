// this : to invoke current class method 

class A{
    void m(){
        System.out.println("hello m ");
    }
    void n(){
        System.out.println("Hello n");
        this.m();
    }
}

public class Test_this4 {
    public static void main(String[] args){
        A a = new A();
        a.n();
        

    }
    
}
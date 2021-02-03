abstract  class animals1 {
    // abstract method 
    public abstract void sound();


    
}

// dog class extends animal class
public class Dog extends animals1{
    public void sound(){
        System.out.println("WOf");

    }
    public static void main(String args){
        animals1 obj = new Dog();
        obj.sound();

    }
}
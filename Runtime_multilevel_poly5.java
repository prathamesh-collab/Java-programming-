class Animal{
    void eat(){System.out.println("eating ");}
}
class Dog extends Animal{
    void eat(){System.out.println("dog eating ");}

}
class BabyDog extends Dog{
    void eat(){System.out.println("baby dog drinking milk ");}
}

public class Runtime_multilevel_poly5{
    public static void main(String[] args ){
        Animal  a1,a2,a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();

    }
    
}
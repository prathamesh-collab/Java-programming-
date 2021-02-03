class Animal{
    void eat(){System.out.println("Eating............");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking");}
}
class babydog extends Dog{
    void weep(){System.out.println("weeping----------");}
}

public class Multilevel_inheritance32{
    public static void main(String[] args ){
        babydog d = new babydog();
        d.eat();
        d.weep();
        d.bark();
        
    }
}
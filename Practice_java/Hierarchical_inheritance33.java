class Animal{
    void eat(){System.out.println("Eating==================");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking++++++++++++++");}
}
class cat extends Animal{
    void ep(){System.out.println("epping==============");}
}
public class Hierarchical_inheritance33{
    public static void  main(String[] args) {
        cat c = new cat();
        c.eat();
        c.ep();
        
    }
}
// superclass :- parent class
// subclass :- child class this class is belong to the superclass 
class Person54{
    int age = 22;

}
class stude extends Person54{
    String name = "tanmay";

}
public class Inheritance29{
    public static void main(String[] args) {
        stude obj = new stude();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }

    
}
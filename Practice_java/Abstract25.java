
// An abstract method is belong to the abstract class , and it does not have a body ,
// the body is provided by the subclass 
abstract class Person{
    public String fname = "pratham";
    public int age = 24;
    public abstract void study();   // abstract method 
}
    class student extends Person{
        public int year = 2018;
        public void study(){
            System.out.println("Studying all day long");

        }

    }
    



public class Abstract25 {
    public static void main(String[] args ){
        student obj = new student();
        System.out.println("name :- " +obj.fname) ;
        System.out.println("Age is "  +obj.age);
        System.out.println("year is " +obj.year);
        obj.study();
    }
    
}
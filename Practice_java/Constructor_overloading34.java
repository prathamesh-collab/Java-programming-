// constructor overloading :- having one or more constructor with differnt no of argument  
class Student5{
    int id ;
    String name;
    int age;
    Student5(int i , String n){            // two argument constructor 
        id = i;
        name = n ;

    }
    Student5(int i , String n , int a){
        id = i ;
        name = n;
        age = a;

    }
    void display(){System.out.println(id + " " +name + " " +age );}




}
public class Constructor_overloading34 {
    public static void main(String[] args ){
        Student5 s1 = new Student5(10, "peatham");
        Student5 s2 = new Student5(15, "tanmmay" , 22);
        s1.display();
        s2.display();
    }
    
}
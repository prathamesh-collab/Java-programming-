//This keyword :- this keyword is reference variable that refers to the current object 
class Student7{
    String name ;
    int rollno;
    int id ;

    Student7(int rollno , String name , int id ){
        this.rollno = rollno;
        this.id=id;
        this.name=name;

    }
    void display(){System.out.println(id + " "+name+ " "+rollno);

}
}
public class This_keyword37 {
    public static void main(String[] args ){
        Student7 s1 = new Student7(1, "Akshay", 01);
        Student7 s2 = new Student7(2, "pratham", 02 );
        s1.display();
        s2.display();

    }
    
}
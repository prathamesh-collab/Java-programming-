// Static keyword :- if we declare any variable as static is know as static variable 
// static variable refers all the comman property of all object 

class Student6{
    int rollno;
    String name ;
    static String collage = "CSMIT ";

    Student6(int i ,String n ){
        rollno = i;
        name = n;

    }
    void display(){System.out.println(rollno+" "+name+ " "+collage);
}
}
public class Static_keyword35 {
    public static void main(String[] args){
        Student6 s1 = new Student6(1, "paathu");
        Student6 s2 = new Student6(2, "rahul");
        s1.display();
        s2.display();


    }
    
}
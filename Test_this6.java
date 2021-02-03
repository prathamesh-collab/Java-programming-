//this() constructor call should be used to reuse the constructor from the constructor 

class student{
    int rollno;
    String name , course;
    float fee;
    student(int rollno , String name , String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;

    }
    student(int rollno , String name , String course , float fee ){
        this(rollno,name,course);   // reusing constructor 
        this.fee=fee;

    }
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);

    }

}

public class Test_this6 {
    public static void main(String[] args){
        student s1 = new student(111, "pratham", "java");
        student s2 = new student(112, "rakesh", "C++" , 50505f);
        s1.display();
        s2.display();
    }
    
}
// a program for :- static keyword with methods and variables 
class student {
    String name;
    int rollno;
    // static variable 
    static String cllgname;
    
    // static counter to set unique roll number 
    static int counter = 0;

    public student(String name){
        this.name = name ;
        this.rollno = setRollno();

    }
    // grtting unique roll number through static variable (counter)
    static int setRollno(){
        counter ++;
        return counter;

    }
    // static method 
    static void setcllg(String name){
        cllgname = name;

    }
    // instance method
     void getstudentinfo(){
         System.out.println("name :- " +this.name);
         System.out.println("roll nn:-" +this.rollno);

        // accessing static variable 
        System.out.println("cllgname :-" +cllgname);


    }
}
public class static_method_ex {
    public static void main(String[] args) {
        // calling static method without instantianig  student class
        student.setcllg("CSmit");

        student s1 =  new student("Alice");
        student s2 = new student("BON");
        s1.getstudentinfo();
        s2.getstudentinfo();
    }
    
}
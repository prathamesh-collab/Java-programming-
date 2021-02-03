// in the above example "Twst_this_keywrd.java" parameters (formal argument) and instance variables are same ,
// so we are using "this" keyword to distinguish local variable ans instance variable 


class stdnt{
    int rollno;
    String name;
    float fee;
    stdnt(int rollno , String name , float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;

    }
    void display(){
        System.out.println(rollno+ " "+name+ " "+fee);
    }
}

public class Test_this_keywd1 {
    public static void main(String[] args){
        stdnt s1 = new stdnt(111, "pratham", 500000);
        stdnt s2 = new stdnt( 123, "rakesh", 20202020);
        s1.display();
        s2.display();
    }
    
}
// where this keyword is not need 

class student{
    int id ;
    String name;
    student(int i , String  n ){
        id = i;
        name = n ;

    }
    void display(){
        System.out.println(id+" "+name );
    }

}


public class Test_this3 {
    public static void main(String[] args){
        student s1 = new student(12, "prathau");
        student s2 = new student(13, "tanu");
        s1.display();
        s2.display();
    }
    
}
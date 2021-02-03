public class static_varibale_ex {
    int rollno ;    // instance variable 
    String name;
    static String collage = "ITS"; //static variable 

    // constructor 

    static_varibale_ex(int r , String n ){
        rollno=r;
        name = n;

    }
    
    // method to display the values

    void display() {
        System.out.println(rollno + " " +name+ " " +collage);
    }

    // test class to show the values of object
    public class TestStaticVariabl1 {

    public static void main(String args[]){
        static_varibale_ex s1 = new static_varibale_ex(111, " pratham ");
        static_varibale_ex s2 = new static_varibale_ex(112, "Tanmay");
        s1.display();
        s2.display();
        
        }
    }
}


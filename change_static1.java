public class change_static1 {
    int rollno ; 
    String name;
    static String collage = "ITS";

    // static method to change the value of static variable 
    static void change(){
        collage = "BBBIT";

    }
    //countsructor to initilize the variable 
    change_static1(int r .String n ){
        rollno = r;
        name = n ;

    }
    // method to display values
    void display(){
        System.out.println(rollno+" "+name+" "+collage);

    }
    // test class to create and display the values of object
    public class TestStaticMethod {
        public static void main(String[] args){
            change_static1.change();
            change_static1 c1 = new change_static1(111,"prat");
        }
    }
}

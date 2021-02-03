// default constructor with parameter

public class param_default_cont {
    int id;
    String name;

    // creating parameterized constructor 
    param_default_cont(int i , String n) {
        id = i;
        name = n ;

    }
    // method to disply the values 
    void display(){
        System.out.println(id+ " "+ name); 

    }
    public static void main(String[] args){

        //creating objects and passing values 
        param_default_cont s1 = new param_default_cont(111,"pratham");
        param_default_cont s2 = new param_default_cont(112, "tanmay");


        // calling method to diplay the values of object 
        s1.display();
        s2.display();
    }

    
}
// this an example of default constructor that display the default values 

public class constructor_default2 {
    int id = 5;
    String name = "king" ;

    void display(){
        System.out.println(id+ " "+name ); 
    }

    public static void main(String[] args ){

        constructor_default2 s1 = new constructor_default2();
        constructor_default2 s2 = new constructor_default2() ;

        // displaying the values of the object 
        s1.display();
        s2.display();

    }

    
}
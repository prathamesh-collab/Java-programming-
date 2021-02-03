public class constructor_overloding {
    int id;
    String name;
    int age;

    // creating two arg constructor

    constructor_overloding(int i , String n) {
        id = 1;
        name = n ;

    }
    
    // creating 3 srg constructor 
    constructor_overloding(int i ,String n, int a ) {
        id = i;
        name = n ;
        age = a;

    }
    void display(){
        System.out.println(id+ " " +name + " " +age); }
        public static void main(String[]  args){
            constructor_overloding s1 = new constructor_overloding(111,"Pratham" );
            constructor_overloding s2 = new constructor_overloding(222, "pratu", 25 );
            s1.display();
            s2.display();
        }
    }
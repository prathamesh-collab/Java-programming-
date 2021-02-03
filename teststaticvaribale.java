 class student{
    int rollno ;                // instatnce vriable
    String name;
    static String collage = "CSMIT";      // Static variable  

    // constructor 
    student(int r , String n){
        rollno = r;
        name = n ;

    }
    // method to display the values 
    void display() {
        System.out.println(rollno+" "+name+" "+collage); 
    }

// test class to show the values of object
public  class teststaticvaribale {

    public static void main(String[] args){

        student s1 = new student(111,"pratham");
        s1.display();
    }
}
}


    

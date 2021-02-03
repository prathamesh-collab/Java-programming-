// Methods are declare in the class and they are used to perform certain action is know as java class method 
// there is two type of method 
// 1:- Static method
// 2:- public method 
// 1 Static method :- we can call the static method without creating object 
// 2 :- public method :- we have to create object to call public method 
public class Class_method21 {
    static void mymethod(){
        System.out.println("this is the static class method  ");
    }
    public void myano(){
        System.out.println("this is public method ");
    }

    

public static void main(String[] args ){
    Class_method21 obj = new Class_method21();
    mymethod();
    obj.myano();




    
}
}

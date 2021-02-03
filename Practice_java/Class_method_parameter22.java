//we also used parameter in the class method 
public class Class_method_parameter22 {
    public  void color(){
        System.out.println("car color is red ");

    }
    public  void speed(int maxspeed){
        System.out.println(" Spped is " +maxspeed );

    }
    

    
public static void main(String[] args ){
    Class_method_parameter22 obj = new Class_method_parameter22();
    obj.color();
    obj.speed(2000);

}
}
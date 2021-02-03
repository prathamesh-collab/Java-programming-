class Shape{
    void draw(){System.out.println("drawing");}
}
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle here ....");}

}
class Squre extends Shape {
    void draw(){System.out.println("Drawing squre here ....");}
}
class Circle extends Shape {
    void draw(){System.out.println("Drawing circle  here ......");}

}

public class Runtime_polymorphism4 {
    public static void main(String[] args ){
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Squre();
        s.draw();



    }
    
}
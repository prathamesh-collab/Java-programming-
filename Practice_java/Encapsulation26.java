//the meaning of Encapsulation is to make sure that sesitive data is hidden from users . to achive this 
// declare clas veiables/attributes as private 
// use set and get method to access and update the value of private variable 

class Person12 {
    private String name ;


    public String getname(){
        return name ;

    }
    public void setname(String  newname ){
        this.name = newname;


    }
    
}
public class Encapsulation26 {
    public static void main(String[] args ){
        Person12 obj = new Person12();
        obj.setname("pratham");
        System.out.println("name is :- " +obj.getname());

    }
}
    

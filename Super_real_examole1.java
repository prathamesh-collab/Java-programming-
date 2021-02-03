// Super example real use
class person{
    int id;
    String name;
    person(int id , String name ){
        this.id = id ;
        this.name = name ;
         
    }

}
class Emp extends person{
    float slary;
    Emp(int id , String name ,Float slary){
        super(id, name);           // reusing parent constructor 
        this.slary= slary;

    }
    void display(){System.out.println(id+" "+name+" "+slary);}
}



public class Super_real_examole1 {
    public static void main(String[] args){
        Emp e = new Emp(1, "pratham", 1.5f);
        e.display();
    }
    
}
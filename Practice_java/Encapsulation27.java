class car{
    String name ;
    int year;

    public String  getname(){
        return name ;

    }
    public void setname(String newname ){
        this.name = newname ;

    }
    public int getyear(){
        return year;

    }
    public void setyear(int newyear){
        this.year = newyear;

    }

}

public class Encapsulation27 {
    public static void main(String args[] ){
        car c = new car();
        c.setname("BMW");
        c.setyear(2020);
        System.out.println("car name is :- " +c.getname());
        System.out.println("car year is :- " +c.getyear());
    }
    
}
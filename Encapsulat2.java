class Encap{
    private String name ;
    private int roll ;
    
    public int getroll(){
        return roll;

    }
    public String getname(){
        return name ;

    }
    public void setroll( int newroll){
        roll = newroll;

    }
    public void setname(String newname){
        name = newname;

    }



}

public class Encapsulat2 {
    public static void main(String[] args){
        Encap obj = new Encap();
        obj.setname("prathamsh");
        obj.setroll(19);
        System.out.println("my name is " +obj.getname() );
        System.out.println("my roll number is " +obj.getroll());


    }
    
}

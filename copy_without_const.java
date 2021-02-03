public class copy_without_const{
    int id;
    String name ; 

    copy_without_const(int i, String n ){
        id = i;
        name = n ;

    }
    copy_without_const(){}
    void display(){
        System.out.println(id+ " "+ name); 
    }
    public static void main(String args[]){
        copy_without_const s1 = new copy_without_const(11, "prathamesh") ;
        copy_without_const s2 = new copy_without_const();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    } 
}
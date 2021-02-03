public class multiple_object {
    int x = 5;
public static void main(String[] args){
    multiple_object myobj1 = new multiple_object();
    multiple_object myobj2 = new multiple_object();
    myobj2.x = 25;                   // creating new object with net varibale x =25 
    System.out.println(myobj1.x);
    System.out.println(myobj2.x);

}    
    
}
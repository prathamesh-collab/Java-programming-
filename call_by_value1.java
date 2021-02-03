class opreation{
    int data = 50 ;

    void change(int data){
        data = data + 100 ;

    }
    
}
public class call_by_value1{
    public static void main(String[] args){
        opreation op = new opreation();

        System.out.println("before change :- "+op.data);
        op.change(500);
        System.out.println("After change :- " +op.data);
        

    }
}
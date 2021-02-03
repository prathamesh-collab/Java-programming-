//           widening casting  // 
 
public class type_casting {
    public static void main(String[] args){
        int myint = 9;
        double mydouble = myint;     // automatically casting : int to double
        System.out.println(myint);
        System.out.println(mydouble);
        
        //***************narowing casting  ************************/ /
        double mdouble = 9.78; 
        int mint = (int) mdouble ;  // manual casting : double to int  
        System.out.println(mdouble);
        System.out.println(mint);
        
    }
    
}
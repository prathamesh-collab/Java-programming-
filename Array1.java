// java program to illustrae how to declare , instantiate , intialize and traverse the java array

public class Array1 {
    public static void main(String[] args){
        int a[] = new int[5];     //declaration and instatiation
        a[0] = 10;          // initilization 
        a[1] = 20;
        a[2] = 30;
        a[3] = 40 ;
        a[4] = 50;
        // traversing array
        for(int i = 0 ; i<a.length; i++) //length is the property of array
        System.out.println(a[i]);
         

    }
    
}
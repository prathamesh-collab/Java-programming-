// try statement allow us to define a block of code to be tested for errors while it is being executed 
// Catch statement is allow us to be define a block of code to be executed if an error accurs in try block 

public class Tty_Execption1 {
    public static void main(String[] args ){
        try {
            int[] mynum = {1,2,3,4};
            System.out.println(mynum[10]);               // this will give a error .. coz we dont have a index till 10 

        }catch(Exception e){
            System.out.println("SOmethomg went wrong ");   //  catch block will catch the error which id found in try block
        }
    }
    
}
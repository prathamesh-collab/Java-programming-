// Break :- we can stop the loop using break statement  
public class Break_continue11 {
    public static void main(String[] args ){
        for(int i = 0; i<=10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);

            // continue :- 
            

            for(int p = 0; p<=15; p++){
                if(p == 4){
                    continue;
                }
                System.out.println(p);
            }
        }
        
    }
    
}
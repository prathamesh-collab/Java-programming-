public class switch_string_example {
    public static void main(String[] args){
        String levelstring="Expert";
        int level = 0;
        switch(levelstring){
        case "Beginner":level=1;
        break;
        case "INtermediate":level=2;
        break;
        case "Expert":level=3;
        break;
        default : level=0;
        break;
        }
        System.out.println("Your level is : " +level);
    }
}







    
    
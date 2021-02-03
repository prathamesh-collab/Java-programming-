// if_else :- is a control structure 
public class If_else5 {
    public static void main(String[] args ){
        int x = 100;
        if(x<=50){
            System.out.println("less than 50 ");

        }else{
            System.out.println("greater than 50 ");

        }
        int year = 2020;
        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println(year + " is a leap year ");

        }else{

            System.out.println(year+ "is normal year");
        }


    }
    }
    

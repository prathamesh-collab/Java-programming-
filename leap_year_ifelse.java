public class leap_year_ifelse {
    public static void main(String[] args){
        int year = 2016;

        if(((year%4==0)&&(year%100!=0)) || (year%400==0)){
            System.out.println("LEAP year");
        }else{
            System.out.println("COMMON year ");

        }    
    }
    
}
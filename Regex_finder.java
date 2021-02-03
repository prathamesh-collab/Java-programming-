import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Regex_finder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true ){
            System.out.println("Enter regex pattern here ");
            Pattern p = Pattern.compile(sc.nextLine());
            System.out.println("Enetr text here :- ");
            Matcher m = p.matcher(sc.nextLine());
            boolean found =  false;
            while(m.find()){
                System.out.println("I found the text " + m.group()+"strting index"+m.start()+"and ending index  "+m.end());
                found = true;

            }
            if(!found){
                System.out.println("No match found " );

            }

            }

        }
    }
    

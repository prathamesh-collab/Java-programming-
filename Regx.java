// find out if there are any occurences of the word "W3school " in a sentence :

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {
    public static void main(String[] args ){
        Pattern pattern = Pattern.compile(" w3schools " ,  Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("VIsit W3SCHOOLS website just for learning ");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");


        } else {
            System.out.println("match not found ");

        }
    }
    
}
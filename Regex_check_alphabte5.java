// java program to check if string contains only Alphabtes 

public class Regex_check_alphabte5 {

    // Function to check String for only Alphabets 
    public static boolean isStringAlphabate(String str) 
    { 
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
    } 
    
    public static void main(String[] args ){
        // checkeing our string 
        System.out.println("test case 1 " );
        String str1 = "Geeksforgeeks";
        System.out.println("Input " +str1);
        System.out.println("Output " + isStringAlphabate(str1));

        // cheching with num values 

        System.out.println("\nTest Case 2:"); 
    
        String str2 = "Geeks4Geeks"; 
        System.out.println("Input: " + str2); 
        System.out.println( "Output: " + isStringAlphabate(str2));
        
        // Checking for null String 
        System.out.println("\nTest Case 3:"); 
  
        String str3 = null; 
        System.out.println("Input: " + str3); 
        System.out.println( "Output: "+ isStringAlphabate(str3));
        
          // Checking for empty String 
          System.out.println("\nTest Case 4:"); 
  
          String str4 = ""; 
          System.out.println("Input: " + str4); 
          System.out.println("Output: " + isStringAlphabate(str4)); 

    }
    
}
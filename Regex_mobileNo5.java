
// Java program to read all mobile numbers 
// present in given file 
import java.util.regex.*; 
import java.io.*; 
  
class Regex_mobileNo5{


 
    public static void main(String[] args) throws IOException 
    { 
        // Write Mobile Numbers to output.txt file 
        PrintWriter pw = new PrintWriter("output.txt"); 
  
        // Regular expression for mobile number 
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 

       // ("^[.+](0/91)?[7-9][0-9]{9}" ) :- this pattern will search only +918108890454 this pattern 

        // BufferedReader for reading from input.txt file 
        BufferedReader br = new BufferedReader 
                                (new FileReader("input.txt")); 
        String line = br.readLine(); 
          
        while (line != null)  
        { 
            Matcher m = p.matcher(line); 
  
            while (m.find())  
            { 
                // Write the mobile number to output.txt file 
                pw.println(m.group()); 
            } 
  
            line = br.readLine(); 
        } 
        pw.flush(); 
    } 
}
import java.io.File ;  // import the file class 
import java.io.FileNotFoundException;       // import this class to handle errors 
import java.util.Scanner;    // import the Scanner class to read text files

public class Read_file1 {
    public static void main(String[] args ){
        try {
            File myobj = new File ("filename.txt");
            Scanner myread = new Scanner(myobj);
            while (myread.hasNextLine()) {
                String data = myread.nextLine();
                System.out.println(data);

            }
            myread.close();
        }catch(FileNotFoundException e ) {
            System.out.println("An occurred ");
            e.printStackTrace();
        } 

        }
    }
    

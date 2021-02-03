// java File permission class contains the permission releted to directory or file . 
import java.io.*;

public class File_permission {
    public static void main(String[] args ){
        File file = new File("output.txt");
        // check if the file exists 
        boolean exists = file.exists();
        if(exists == true )
        {


            // printing the pwermissions associated with the file 
            System.out.println("Executable :- " +file.canExecute());
            System.out.println("Readable :- " +file.canRead());
            System.out.println("Writable :- "+file.canWrite());

        }else{
            System.out.println("File not found ");
        }
        
    }
    
}
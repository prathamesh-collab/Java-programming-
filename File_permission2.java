import java.io.*;
import java.util.Scanner;

public class File_permission2 {
    public static void main(String[] args ){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter file name of path of the file :- ");
        String file = c.nextLine();
        File p = new File(file );
        boolean exists = p.exists();
        if(exists == true)
        {
            System.out.println("Execytable :- "+p.canExecute());
            System.out.println("Readable :- "+p.canRead());
            System.out.println("Writable :- "+p.canWrite());

        }else{
            System.out.println("File not found ");
        }
    }
    
}
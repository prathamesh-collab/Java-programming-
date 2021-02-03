import java.io.File;           // Import the file class
import java.io.IOException; // Import the IOExeception class to handle errors

public class Create_file1 {
    public static void main(String[] args){
        try{
            File myobj = new File("Filename.txt");
            if (myobj.createNewFile()){
                System.out.println("File created sucessfully: " +myobj.getName());

            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e ) {
            System.out.println("An error occured");
            e.printStackTrace();
        }


        }
    }
    

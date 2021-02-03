import java.io.FileWriter;       // Import the FileWriter class
import java.io.IOException;     // Import the IOExceptio class to handle errors

 
public class Write_file1 {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("this file is crested by using file write module");
            myWriter.close();
            System.out.println("Sucessfully wrote to the file ");
        }
        catch (IOException e ) {
            System.out.println("An error occured");
            e.printStackTrace();
        } 
        }
    

    }
    
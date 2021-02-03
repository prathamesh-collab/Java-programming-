import java.io.File;   //import File class
public class Delete_file1 {
    public static void main(String[] args){
        File myobj = new File("filename.txt");
        if (myobj.delete() ) {
            System.out.println("Deleted the file :- "+myobj.getName());

        }else {
            System.out.println("Failed to delete the file ");
            
        }
    }
    
    
}
import java.io.*;

public class Chnage_file_permission {
    public static void main(String[] args ){
        File file = new File("/home/devloper-pratthamesh/pratu.txt");

        boolean exists = file.exists();
        if(exists == true){
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(true);
            System.out.println("File permission chnage ");

            System.out.println("Executable :- "+file.canExecute());
            System.out.println("Readable :- " +file.canRead());
            System.out.println("Writable" +file.canWrite());
        }
        else {

        
     
        System.out.println("File not found ");

    }
}
}

    

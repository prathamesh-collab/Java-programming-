// it can implement the inputstrem . it contain differnt sub classes as Bufferedinputstream , Datainputstream for providing additional 
// functionallity
// example of FilterinputStream
import java.io.*;
import java.io.FileInputStream;
public class FilterinputStream {
    public static void main(String[] args ){
        File data = new File("output1.txt");
        FileInputStream file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k = 0;
        while((k=filter.read())!= -1){
            System.out.println((char)k);


        }
        file.close();
        filter.close();
    }
    
}
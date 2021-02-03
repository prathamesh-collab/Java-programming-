import java.io.FileOutputStream;


import java.io.BufferedOutputStream;
public class Bufferedoutput1{
    public static void main(String[] args ){
        String data = "This is file created by using BufferReaderuotputstream class ";
        try{
            FileOutputStream file = new FileOutputStream("output.txt");

            BufferedOutputStream out = new BufferedOutputStream(file);
            byte[] array = data.getBytes();

            out.write(array);
            out.close();
            System.out.println("Sucessfully Written");

        
    }catch(Exception e){
        e.getStackTrace();
    }
}
}


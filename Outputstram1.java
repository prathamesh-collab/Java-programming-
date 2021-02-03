import java.io.FileOutputStream;

public class Outputstram1 {
    public static void main(String[] args ){
        try{
            FileOutputStream f = new FileOutputStream("test.txt");
            String s = "Welcome to java ";
            byte b[] = s.getBytes();
            f.write(b);

            f.close();
            System.out.println("Sucessfully written");

        }catch(Exception e ){System.out.println(e);}
    }
    
}
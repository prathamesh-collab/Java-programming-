

//As the name sugges it can be used to read byte array as input stream
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;

public class Bytearrayinputstream {
    public static void main(String[] args){
        byte[] buf = {35,36,37,38,39,40,41};
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while((k=byt.read())!=-1){
            char ch = (char)k;
            System.out.println(("ASCII value of charecter is :" +k + "; special chrecter is : - "+ch));
        }
    }
    
}
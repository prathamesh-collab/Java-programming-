// java thread example by extending thread class 
class Mullti extends Thread{
    public void run(){
        System.out.println("thread is running ............."); 
    }

}
public class multithread1 {
    public static void main(String[]  args ){
        Mullti t1 = new Mullti();
        t1.start();

    }
    
}
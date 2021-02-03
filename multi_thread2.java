class multi implements Runnable{
    public void run(){
        System.out.println("thread is runnnig ***************");
    }
}
public class multi_thread2 {
    public static void main(String[] args ){
        multi m = new multi();
        Thread t1 = new Thread(m);
        t1.start();
    }
    
}
class Pat extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Current1_thred {
    public static void main(String[] args ){
        Pat t1 = new Pat();
        Pat t2 = new Pat();
        t1.start();
        t2.start();
        
    }
    
}
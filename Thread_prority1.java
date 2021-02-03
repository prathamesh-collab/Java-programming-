class Sat extends Thread{
    public void run(){
        System.out.println("running thread name is :- " +Thread.currentThread().getName());
        System.out.println("running thread priority is " +Thread.currentThread().getPriority());

    }
}

public class Thread_prority1 {
    public static void main(String[] args ){
        Sat t1 = new Sat();
        Sat s2 = new Sat();
        t1.setPriority(Thread.MIN_PRIORITY);
        s2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        s2.start();
        
    }
    
}
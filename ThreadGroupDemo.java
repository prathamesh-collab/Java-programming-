class Xyt implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());

    }
}
public class ThreadGroupDemo{
    public static void main(String[] args ){
        ThreadGroupDemo runnable =  new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent Threadgroup");
        Thread t1 = new Thread(tg1,runnable,"one");
        t1.start();
        Thread t2 = new Thread(tg1,runnable,"Two ");
        t2.start();
        System.out.println("thred group name "+tg1.getName());
        tg1.list();



    }
}
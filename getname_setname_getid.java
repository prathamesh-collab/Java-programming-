class Rat extends Thread{
    public void run(){
        System.out.println("running ===============");
    }
}
public class getname_setname_getid{
    public static void main(String[] args){


        Rat t1 = new Rat();
        Rat t2 = new Rat();
        System.out.println("name of t1 :- "+t1.getName());
        System.out.println("name of t2 :- "+t2.getName());
        System.out.println("id of t1 is :- "+t1.getId());
        System.out.println("id of t2 is :- "+t2.getId());
        t1.start();
        t2.start();

        t1.setName("pratham");
        System.out.println("After chainging the name :- "+t1.getName());
    }
}


class Bank{
    float getRateofintrest(){return 0; }
}
class SBI extends Bank{
    float getRateofintrest(){return 8.4f;}
}
class ICIC extends Bank{
    float getRateofintrest(){return 7.5f;}

}
class AXIS extends Bank{
    float getRateofintrest(){return 9.5f ;}

}

public class Runtime_poly3 {
    public static void main(String[] args ){
        Bank b;
        b = new SBI();
        System.out.println("SBI rate is :-"+b.getRateofintrest());
        b = new ICIC();
        System.out.println("ICIC rate is :- " +b.getRateofintrest());
        b = new AXIS();
        System.out.println("AXIs rate is :- "+b.getRateofintrest());

    }
}

    
    

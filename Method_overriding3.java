// creating parent class 
class Bank{
    int getRateOfinterest(){return 0;}
}
//creating child class
class SBI extends Bank{
    int getRateOfinterest(){return 8;}
}
class ICIC extends Bank{
    int getRateOfinterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfinterest(){return 9;}
}

public class Method_overriding3 {
    public static void main(String[] args){
        SBI s = new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();
        System.out.println("SBI rate is :- " +s.getRateOfinterest());
        System.out.println("ICIC rat is :-" +i.getRateOfinterest());
        System.out.println("AXIs bank rate is :-" +a.getRateOfinterest());
        
    }
    
}
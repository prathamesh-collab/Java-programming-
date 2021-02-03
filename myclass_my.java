abstract class myclass{
    public void disp() {
        System.out.println("Concrete method of paraent class ");
    }
    abstract public void disp2();
}

class demo extends myclass{
    public void disp2(){
        System.out.println("overriding abstract method ");

    
    }   
class myclass_my{

    public static void main(String args[]){
        demo obj = new demo();
        obj.disp2();
    }
}


    }



    
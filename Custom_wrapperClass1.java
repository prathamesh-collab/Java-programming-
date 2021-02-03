//creating custom Wrapper class
class Javapoint{
    private int i ;
    Javapoint(){}
    Javapoint(int i){
        this.i=i;

    }
    public int getvalue(){return i;}
    public void setvalue(int i){
        this.i = i;
    }
    public String toString(){
        return Integer.toString(i);
    }
}

public class Custom_wrapperClass1 {
    public static void main(String[] args){
        Javapoint j = new Javapoint(10);
        System.out.println(j);
        
    }

    
}
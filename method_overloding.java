public class method_overloding {
    static int plusmethod(int x , int y){

        return x+y;

    }
    static double plus(double x , double y){
        return x + y;

    }
    public static void main(String[] args) {
        int num1 = plusmethod(8, 8);
        double num2 = plus(5.5, 4.5);
        System.out.println("int : " +num1);
        System.out.println("double :" +num2);


    }
}


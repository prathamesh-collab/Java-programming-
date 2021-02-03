public class method_if_else {
    static void checkage(int age){
        if (age < 18){
            System.out.println("acces denied");

        }else if(age > 18){
            System.out.println("granted");

        }else if(age == 18 ){
            System.out.println("promot");

        }
    }

        public static void main(String[] args){
            checkage(18);
        }
    }
    

           





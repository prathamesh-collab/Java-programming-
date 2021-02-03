public class nasted_if_else {
    public static void main(String[] args){
        int age=20;
        int weight = 55;
        if(age>18){
            if(weight>52){
                System.out.println("you are eligible to donate blood");

            }else{
                System.out.println("YOU are not eligible to donate blood");
            }

        }else{
            System.out.println("Age must be greater than 18");

        }
    }
    
}
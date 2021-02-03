// cloning:- its create a deep copy which means its copy actual value

public class Cloning_array1 {
    public static void main(String[] args){
        int arr[] = {33,3,4,5};
        System.out.println("printing orignal array");
        for(int i:arr)
        System.out.println(i);

        System.out.println("printing clon of the array");
        int carr[] = arr.clone();
        for(int i:carr)
        System.out.println(i);

        System.out.println(" Are both equal ?? ");
        System.out.println(arr == carr);

    }
    
}
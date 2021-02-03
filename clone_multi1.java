//java program to demonstrate cloning of multidimensional arrays

// IMP :- if we create a multidimensional clone it will create shallow copy which means its copies the refernce


public class clone_multi1 {
    public static void main(String[] args){
        int intArray[][] = {{1,2,3},{4,5}};
        int cloneArray[][] = intArray.clone();
        // will print false
        System.out.println(intArray == cloneArray);

        // will print true shallow copy is created 
        // i.e sub-Arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);

    }
    
}
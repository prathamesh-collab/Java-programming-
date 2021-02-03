// java program to illustrate creating an array of objects

class Student{
    public int roll_no;
    public String name;
    Student(int roll_no , String name){
        this.roll_no = roll_no;
        this.name = name;

    }
}

// Elements of array are objects of a class student

public class Array4 {
    public static void main(String[] args){
        // declares an Array of integers
        Student[] arr;
        // allocating memory for 5 objects of type student
        arr = new Student[5];

        arr[0] = new Student(1,"amana");
        arr[1] = new Student(2,"pratham");
        arr[2] = new Student(3,"Rahul");
        for (int i = 0; i<arr.length; i++)
        System.out.println("Element at" + i + " : " + arr[i].roll_no+" "+arr[i].name );


    }
    
}
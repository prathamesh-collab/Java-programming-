// this program is for understanding the use of this keyword .. run this program without (This) keyword 
// we will see the solution of this program in next file :- Test_this_keywd1.java


class stud{
    int rollno ;
    String name;
    float fee;
    stud(int rollno , String name , float fee){
        rollno = rollno;

        name = name ;
        fee = fee;


    }
    void dispplay(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}



public class Test_this_keywrd {
    public static void main(String[] args){
        stud s1 = new stud(111, "prath",50000);
        stud s2 = new stud(112, "raku",20000);
        s1.dispplay();
        s2.dispplay();

    }
    
}
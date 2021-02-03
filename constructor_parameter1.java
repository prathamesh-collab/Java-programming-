public class constructor_parameter1 {
    int modelyear;
    String modelname ;

    public constructor_parameter1(int year , String name ) {
        modelyear = year;
        modelname = name ;

    }
    public static void main(String[] args){
        constructor_parameter1  mycar = new constructor_parameter1(1998, "BMW") ; 

        System.out.println(mycar.modelyear +  " " +mycar.modelname);
        
    }
    
}
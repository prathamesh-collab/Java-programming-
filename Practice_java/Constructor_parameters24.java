public class Constructor_parameters24 {
    int modelcar;
    String modelname ;

    public Constructor_parameters24(int year, String name){

        modelcar = year;
        modelname = name;

    }
    public static void main(String[] args ){
        Constructor_parameters24 obj = new Constructor_parameters24(12,"pratham");
        System.out.println(obj.modelcar);
        System.out.println(obj.modelname);


    }
}
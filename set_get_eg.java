class person{
    private String name ; // private  = restricted access 
    // Getter 
    public String getName(){
        return name ;

    }
    // setter 
    public void setName(String newName){
        this.name = newName;


    }
}  

public class set_get_eg {
    public static void main(String[] args){
        person myobj = new person();
        myobj.setName("jon");
        System.out.println(myobj.getName()); 

    }

}
        
    



        
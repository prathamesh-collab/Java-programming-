class Employee{
    float salary = 40000;
}
class programmer extends Employee{
    int bonus = 10000;

}

public class inheritance_eg {
    public static void main(String[] args){
        programmer p = new programmer();
        System.out.println("programmer salary is :-" +p.salary);
        System.out.println("Bonus of programmer is:-" +p.bonus);
    }
    
}
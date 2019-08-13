package chap3;
public class Employee{
    static int id = 1001;
    String name = "Asron";
    int age = 21;
    
    static void work(){
        System.out.println("waork()");
        }
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        System.out.println("Id :"+id);
        work();
        
        Employee n = new Employee();
        System.out.println("name :"+n.name);
        System.out.println("age :"+n.age);
        n.getSalary();
    }
}


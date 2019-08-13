package chap3;
public class CallEmployee {
    public static void main(String[] args) {
        System.out.println("Employee :"+Employee.id);
        Employee.work();
        
        Employee n = new Employee();
        System.out.println("name :"+n.name);
        System.out.println("age :"+n.age);
        n.getSalary();
              
    }
    
}

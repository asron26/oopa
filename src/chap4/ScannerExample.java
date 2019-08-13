package chap4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();
        
        System.out.print("Enter age:");
        int age = sc.nextInt();
        
        
        System.out.print("Enter salary:");
        double salary = sc.nextDouble();
        
        System.out.print("Employee name :"+name);
        System.out.println(",age :"+age+",salary:"+salary);
    
        if(age <1 || age >65){
            System.out.println("Error!! age must be 1 - 65");
       }else if(age >= 60){
            System.out.println("age :"+age+",Older");
       }else if(age >=30){
            System.out.println("age:"+age+",Middle-age");            
       }else if(age >=20){
            System.out.println("age:"+age+",Adult"); 
       }else if(age >=12){
            System.out.println("age"+age+"Teenage");    
       }else if(age >=1){
            System.out.println("age"+age+"Child");
       }else{
            System.out.println("none");
       }
        System.out.print("Enter degree :");
        int degree = sc.nextInt();
        
        switch (degree){
            case 1:
                 System.out.println("Bechelor");
                 break;
            case 2:
                 System.out.println("Master's degree");
                 break;  
             case 3:
                 System.out.println("Phd");
                 break;
             default :
                 System.out.println("None");
                 break;
        
        }
    }
}

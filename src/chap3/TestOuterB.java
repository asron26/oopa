package chap3;

    //(2)
class OuterB{
        int OuterAttribute1 = 5;
        static int OuterAttribute2 =10;
        
        void outerMethod1(){
            System.out.println("OuterB : outerMethod1()");
        }
        
        static void outerMethod2(){
            System.out.println("OuterB : outerMethod2()");
        }
        
class MemberInner{
    int memberAttribute1 = 15;
      
    void memberInnerMethod(){
        System.out.println(memberAttribute);
        System.out.println(outerAttribute1 + "," + outerAttribute2);
        outerMethod1();
        outerMethod2();
            }   
        }    
                
    }
           
//(1)
public class TestOuterB {
    
    public static void main(String[] args) {
    OuterB outObj = new OuterB();
    OuterB.MemberInner innerObj = outObj.new MemberInner(); 
    innerObj.memberInnerMethod();  
        
    }

    
}//endclass

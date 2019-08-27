package chap3;

    //(2)
class OuterA{
        int OuterAttribute1 = 5;
        static int OuterAttribute2 =10;
        
        void outerMethod1(){
            System.out.println("Outer : outerMethod1()");
        }
        
        static void outerMethod2(){
            System.out.println("OuterA : outerMethod2()");
        }
        
        static class StaticInner{
            int staticInnerAttribute1 = 15;
            static int staticInnerAttribute2 =20;
            
            void staticInnerMethod1(){
                System.out.println(staticInnerAttribute1+","+staticInnerAttribute2);
                System.out.println("outerAttribute2");
            }
            static void staticInnerMethod2(){
                outerMethod2();
            }
        }//end class
}
//(1)
public class TestOuterA {
    
    public static void main(String[] args) {
    OuterA.StaticInner innerObj = new OuterA.StaticInner();
    innerObj.staticInnerMethod1(); //call non-static method
    OuterA.outerMethod2();  //call static method  
        
    }

    
}//endclass

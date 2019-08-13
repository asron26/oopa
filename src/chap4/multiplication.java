package chap4;


public class multiplication {   
    public static void main(String[] args) {
        int weidth = 12;
        int height = 12;
        System.out.println("----------------------------------------------multiplication--------------------------------------------");
        System.out.println("        1       2       3       4       5       6       7       8       9       10      11      12 ");
        System.out.println("----------------------------------------------multiplication--------------------------------------------");
        for (int i=2; i<= height; i++  ){
            System.out.print("i");
        for (int j = 1; j<= weidth; j++  ){
            System.out.print("\t"+(i*j));
            }
            System.out.println();    
        }        
    }
    
}

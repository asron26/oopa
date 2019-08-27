package chap3;

class Account{
    private int AccountId;
    private String AccountName;

    public Account(int AccountId, String AccountName) {
        this.AccountId = AccountId;
        this.AccountName = AccountName;
    }

    public int getAccountId() {
        return AccountId;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }
    
}//end class
public class PassByValueandPassByreference {
    
    public static void changeDoubleValue(double newRate){
        newRate = 3.75;
    }   
    public static void changeObjectAttribute(Account actObj){
        actObj.setAccountName("Anny");
        
    }
    public static void main(String[] args) {
        double interestRate = 4.99;
        System.out.println("---pass by value---");
        System.out.println("Before calling method : intersetRate=" +interestRate);
        changeDoubleValue(interestRate);  //pass by value
        System.out.println("After calling method : interestRate="+interestRate);
        
        System.out.println("---pass by Reference---");
        Account actObj = new Account(105227,"No Name");
        System.out.println(" Before calling method ;");
        System.out.println(" actObj ="+actObj);
        System.out.println(" Id = "+actObj.getAccountId());
        System.out.println(" Name ="+actObj.getAccountName());
        
        changeObjectAttribute(actObj);
        System.out.println(" After calling method"); //pass By reference
        System.out.println(" actObj =" +actObj);
        System.out.println(" Id = "+ actObj.getAccountId());
        System.out.println(" Name ="+actObj.getAccountName());
    }
}

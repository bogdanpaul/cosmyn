
package bankapp;

public class Saving extends Account {

    private static String accountType = "Savings";
    Saving(double initialDeposit){
        super();
        this.setBalanced(initialDeposit);
        this.checkInterest(0);
    }

   
    @Override
    public String toString(){
        return "Account Type: " + accountType + "Account/n"+
                "Account Number: " + this.getAccountNumber() + "/n" +
                "Balance: " +this.getBalanced()+ "/n"+
                "Interest Rate: " + this.getInterest()+ "%/n";
    }
}

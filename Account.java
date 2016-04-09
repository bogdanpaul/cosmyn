
package bankapp;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;


public class Account {
    
    private double balanced = 0;
    private double interest = 0.02;
    private int accountNumber;
    private static int numberOfAccount = 1000000;
    private double balance;
    
    Account(){
        accountNumber = numberOfAccount++;
    }

    
    public double getBalanced() {
        return balanced;
    }

    
    public void setBalanced(double balanced) {
        this.balanced = balanced;
    }

   
    public double getInterest() {
        return interest*100;
    }

    
    public void setInterest(double interest) {
        this.interest = interest;
    }

    
    public int getAccountNumber() {
        return accountNumber;
    }

   public void withdraw(double amount){
       
           if(amount + 5 > balance){
           System.out.println("You have insufficinet funds !");
           return;
       }
       balance -= amount + 5;
       checkInterest(0);
       System.out.println("You have withdraw $" + amount + "dollars and inccured a fee of 5$");
       System.out.println(" You now have a balance of $" + balance);
   }
   
   public void deposit(double amount){
       if(amount <= 0){
           System.out.println("you cannot deposit negative money.");
           return;
       }
       checkInterest(amount);
       amount = amount + amount + interest;
       balance +=amount;
       System.out.println("You have deposited $" + amount + "dollars with an interest rate of" + (interest *100) + "%");
       System.out.println(" You now have a balance of $" + balance);
   }
  public void checkInterest(double amount){
       if(balance + amount > 10000){
           interest = 0.05;
       }else{
           interest = 0.02;
       }
   }
}

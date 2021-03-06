/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author oninafelicia
 */
public class Customer {
    private final String firstName;
    private final String lastName;
    private final String ssn;
    private final Account account;

    Customer(String firstName, String lastName, String ssn, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.account = account;
    }
    @Override
    public String toString(){
        return"/nCustomer Information/n" +
                "first Name: " + firstName +"/n"+
                "last Name: " + lastName + "/n"+
                "ssn: " + ssn + "/n"+
                account;
    }
    public String basicinfo(){
       
       return  " first Name: " + firstName +
                " last Name: " + lastName + 
                " ssn: " + ssn + 
                " account number: " + account.getAccountNumber();
    }
    Account getAccount(){
        return account;
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Sholiha
 */
public class BusinessAccount {
    public static final double MIN_BALANCE = 2000.00;
    public static final double OVERDRAW_LIMIT = -1000.00;
    public static final double TRANS_FEE_NORMAL = 2.00;
    public static final double TRANS_FEE_OVERDRAW = 5.00;
    public static final String ERR_OVERDRAW_LIMIT_EXCEED = "Error: Transaction cannot be processes. "
            + "Overdraw limit exceeded.";
    private State objState;
    private String accountNumber;
    private double balance;
    
    public void setState(State newState){
        objState = newState;
    }
    
    public State getState(){
        return objState;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public boolean deposit(double amount){
        if(objState.deposit(amount)){
            System.out.println("An amount "+amount+" is deposited");
            return true;
        }else{
            System.out.println(ERR_OVERDRAW_LIMIT_EXCEED);
            return false;
        }
        
    }
    
    public boolean withdraw(double amount){
        if(objState.withdraw(amount)){
            System.out.println("An amount "+amount+" is withdrawn");
            if(balance<0){
                System.out.println("Attention: Your Account is Overdrawn");
            }
            return true;
        }else{
            System.out.println(ERR_OVERDRAW_LIMIT_EXCEED);
            return false;
        }
    }
    
    public BusinessAccount(String accountNum){
        this.accountNumber = accountNum;
        objState = new NoTransactionFeeState(this);
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    
    public String toString(){
        return "Account number = "+accountNumber+", Balance = "+balance;
    }
    
}

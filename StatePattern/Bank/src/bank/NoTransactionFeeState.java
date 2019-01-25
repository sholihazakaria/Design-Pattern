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
public class NoTransactionFeeState implements State{

    BusinessAccount businessAccount;

    public NoTransactionFeeState(BusinessAccount businessAccount) {
        this.businessAccount = businessAccount;
    }

    @Override
    public State transitionState() {
        if(businessAccount.getBalance() > businessAccount.MIN_BALANCE){
            return this;
            
        }else if(businessAccount.getBalance()>=0 && businessAccount.getBalance()<businessAccount.MIN_BALANCE){
            return new TransactionfeeState(businessAccount);
            
        }else{
            return new OverdrawnState(businessAccount);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        double newBalance = businessAccount.getBalance() - amount;

        if(newBalance > businessAccount.OVERDRAW_LIMIT){
            businessAccount.setBalance(newBalance);
            businessAccount.setState(transitionState());
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deposit(double amount) {
        double newBalance = businessAccount.getBalance() + amount;
        
        if(newBalance > businessAccount.OVERDRAW_LIMIT){
            businessAccount.setBalance(newBalance);
            businessAccount.setState(transitionState());
            return true;
        }else{
            return false;
        }
        
    }
    
}

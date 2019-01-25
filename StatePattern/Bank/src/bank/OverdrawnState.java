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
public class OverdrawnState implements State{

    BusinessAccount businessAccount;

    public OverdrawnState(BusinessAccount businessAccount) {
        this.businessAccount = businessAccount;
    }

    @Override
    public State transitionState() {
        if(businessAccount.getBalance() > businessAccount.MIN_BALANCE){
            return new NoTransactionFeeState(businessAccount);
            
        }else if(businessAccount.getBalance()>=0 && businessAccount.getBalance()<businessAccount.MIN_BALANCE){
            return new TransactionfeeState(businessAccount);
            
        }else{
            return this;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        amount = amount + businessAccount.TRANS_FEE_OVERDRAW;
        double newBalance = businessAccount.getBalance() - amount;

        if(newBalance > businessAccount.OVERDRAW_LIMIT){
            System.out.println("Transaction Fee ($5.0)was charged due to account status (Overdrawn)");
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
        newBalance = newBalance - businessAccount.TRANS_FEE_OVERDRAW;
        
        if(newBalance > businessAccount.OVERDRAW_LIMIT){
            System.out.println("Transaction Fee ($5.0)was charged due to account status (Overdrawn)");
            businessAccount.setBalance(newBalance);
            businessAccount.setState(transitionState());
            return true;
        }else{
            return false;
        }
    }
}

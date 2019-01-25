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
public class TransactionfeeState implements State{

    BusinessAccount businessAccount;

    public TransactionfeeState(BusinessAccount businessAccount) {
        this.businessAccount = businessAccount;
    }

    @Override
    public State transitionState() {
        if(businessAccount.getBalance() > businessAccount.MIN_BALANCE){
            return new NoTransactionFeeState(businessAccount);
            
        }else if(businessAccount.getBalance()>=0 && businessAccount.getBalance()<businessAccount.MIN_BALANCE){
            return this;
            
        }else{
            return new OverdrawnState(businessAccount);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        amount = amount + businessAccount.TRANS_FEE_NORMAL;
        double newBalance = businessAccount.getBalance() - amount;

        if(newBalance > businessAccount.OVERDRAW_LIMIT){
            System.out.println("Transaction Fee ($2.0)was charged due to account status (less than minimum balance)");
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
        newBalance = newBalance - businessAccount.TRANS_FEE_NORMAL;

        if(newBalance > businessAccount.OVERDRAW_LIMIT){
            System.out.println("Transaction Fee ($2.0)was charged due to account status (less than minimum balance)");
            businessAccount.setBalance(newBalance);
            businessAccount.setState(transitionState());
            return true;
        }else{
            return false;
        }
    }
    
}

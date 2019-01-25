/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.manager;

/**
 *
 * @author Sholiha
 */
public class CustomerFacade {
    CreditCard cc;
    Address add;
    Account acc;
    
    public CustomerFacade(CreditCard cc, Address add, Account acc){
        this.cc = cc;
        this.add = add;
        this.acc = acc;
        
    }
    
    public void register(){
        
        System.out.println("First name = " + acc.getFirtsName()+
                            ", Last name = " + acc.getLastName());
        System.out.println("Address = " + add.getAddress() + 
                            ", City = " + add.getCity() + 
                            ", State = " + add.getState());
        System.out.println("Card type = " + cc.getCardType() + 
                            ", Card number = "+ cc.getCardNumber() + 
                            ", Card expiry date" + cc.getCardExpDate());
        
        
        boolean accnt,addrs,crdtcard;
        
        if(acc.isValid()){
            accnt = true;
            System.out.println("Valid FirstName/LastName");
        }else{
            accnt = false;
            System.out.println("Invalid FirstName/LastName");
        }
        
        if(add.isValid()){
            addrs = true;
            System.out.println("Valid Address/City/State");
        }else{
            addrs = false;
            System.out.println("Invalid Address/City/State");
        }
        
        if(cc.isValid()){
            crdtcard = true;
            System.out.println("Valid Credit Card");
        }else{
            crdtcard = false;
            System.out.println("Invalid Credit Card");
        }
        
        if(accnt == true && addrs == true && crdtcard == true){
            acc.save();
            add.save();
            cc.save();
            System.out.println("==> Valid Customer Data: Data Saved Successfully");
        }else{
            System.out.println("==> Invalid Customer Data: Data Could Not Be Saved");
        } 
    }
    
}

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
public class AccountManager {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("First customer:");
        Account acc = new Account("John","Smith");
        Address add = new Address("101 Jalan Bukit","Shah Alam","Selangor");
        CreditCard cc = new CreditCard("Visa","1111222233334444","01/09/2020");
        
        CustomerFacade cf = new CustomerFacade(cc,add,acc);
        cf.register();
        
        System.out.println("\n");
        
        System.out.println("Second customer:");
        Account acc2 = new Account("Vijaya","K");
        Address add2 = new Address("1 Jalan University","Kuala Lumpur","Wilayah Persekutuan KL");
        CreditCard cc2 = new CreditCard("Master","9999888877776666","01/01/2020");
        
        CustomerFacade cf2 = new CustomerFacade(cc2,add2,acc2);
        cf2.register();
        
        System.out.println("\n");
        
        System.out.println("Third customer:");
        Account acc3 = new Account("Aryati","Ahmad");
        Address add3 = new Address("35 Wisma Jaya","Petaling Jaya","Selangor");
        CreditCard cc3 = new CreditCard("Master","555566667777","01/05/2023");
        
        CustomerFacade cf3 = new CustomerFacade(cc3,add3,acc3);
        cf3.register();
    }
    
}

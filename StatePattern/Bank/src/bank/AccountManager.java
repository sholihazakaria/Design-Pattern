/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

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
        
        BusinessAccount account = new BusinessAccount("1111 2222 3333 4444");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i>=0; i++){
            System.out.println("Enter 1 to display account, 2 to deposit, 3 to withdraw, 0 to exit : ");
            String choice = input.next();
            
            if(choice.equals("1")){
                System.out.println(account);
            }else if(choice.equals("2")){
                System.out.println("Enter amount to deposit: ");
                double amount = input.nextDouble();
                account.deposit(amount);
            }else if(choice.equals("3")){
                System.out.println("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                account.withdraw(amount);
            }else if(choice.equals("0")){
                break;
            }else{
                System.out.println("Invalid choice. Please try again");
            }
        }
    }
    
}

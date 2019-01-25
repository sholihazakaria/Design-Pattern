/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

/**
 *
 * @author Sholiha
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card one = new Visa("1234123412341234","VisaCard",2004,11);
        one.validateCard();
        System.out.println("");
        
        Card two = new Visa("1234567890123456","VisaCard",2020,11);
        two.validateCard();
        System.out.println("");
        
        Card three = new Visa("4234567890123456", "VisaCard", 2020, 11);
        three.validateCard();
        System.out.println("");
        
        Card four = new MasterCard("5448755330349315", "MasterCard", 2021, 4);
        four.validateCard();
        System.out.println("");
        
        Card five = new DinersClub("30263720264678", "DinersCard", 2025, 5);
        five.validateCard();
    }
    
}

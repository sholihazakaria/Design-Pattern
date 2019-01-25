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
import java.util.Calendar;
import java.util.Date;
public abstract class Card {
    
    String CardNumber;
    String CardType;
    int ExpMonth;
    int ExpYear;
    
    public Card(String CardNumber, String CardType,int ExpYear, int ExpMonth){
        this.CardNumber = CardNumber;
        this.CardType = CardType;
        this.ExpMonth = ExpMonth;
        this.ExpYear = ExpYear;
    }
    
    public final void validateCard(){
        //template
        boolean temporary =  true;
        if(expiryDateCheck(ExpYear,ExpMonth) == false){
            System.out.println("Invalid Expiry Date");
            temporary = false;
        }
        if(ValidCharacterCheck(CardNumber) == false){
            System.out.println("Invalid Character");
            temporary = false;
        }
        if(isValidCheckSum(CardNumber) == false){
            System.out.println("Invalid Check Sum");
            temporary = false;
        }
        if(lengthCheck() == false){
            System.out.println("Invalid length");
            temporary = false;
        }
        if(prefixCheck()== false){
            System.out.println("Invalid prefix");
            temporary = false;
        }
        isAccountInGoodStand();
        
        if(temporary == true){
            System.out.println("This credit card is valid");
        }else{
            System.out.println("This credit card is invalid");
        }
    }
    
    public boolean expiryDateCheck(int ExpYear, int ExpMonth){
        //same
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH);
        
        if(ExpYear > currentYear){
            
            if(ExpMonth > currentMonth)
                return true;
            else
                return false;
        } else{
            return false;
        }
    }
    
    public boolean ValidCharacterCheck(String CardNumber){
        
            if(!CardNumber.matches("-?\\d+(\\.\\d+)?")){
                return false;
            }
            else{
                return true;
            }
       
        
    }
    
    public boolean isValidCheckSum(String CardNumber){
        boolean result = true; 
 
        int sum = 0;
        int multiplier = 1;
        int strLen = CardNumber.length(); 
 
        for (int i = 0; i < strLen; i++) {
            String digit = CardNumber.substring(strLen - i - 1, strLen - i);
            int currProduct = new Integer(digit).intValue() * multiplier;
            if (currProduct >= 10)
                sum += (currProduct % 10) + 1;
            else
                sum += currProduct;

            if (multiplier == 1)
                multiplier++; 
            else
                multiplier--;     }
    
        if ((sum % 10) != 0)
            result = false; 

         return result;
    }
    
    public abstract boolean lengthCheck();
    
    public abstract boolean prefixCheck();
    
    public abstract boolean isAccountInGoodStand();
    
}

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
public class CreditCard {
    String cardType;
    String cardNumber;
    String cardExpDate;
    final String CC_DATA_FILE = "cc.txt";
    public static final String VISA = "Visa";
    public static final String MASTER = "Master";

    public CreditCard(String cardType, String cardNumber, String cardExpDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
    }

    
    public boolean isValid(){
        if(getCardType().equals(VISA) || getCardType().equals(MASTER)){
            return (getCardNumber().trim().length() == 16);
        }
        return false;
    }
    
    public String getCardType() {
        return cardType;
    }

    public CreditCard() {
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }
    
    
    public boolean save(){
        FileUtility futil = new FileUtility();
        String dataLine = getCardType()+ "," + getCardNumber()+ "," +getCardExpDate();
        return futil.WriteToFile(CC_DATA_FILE,dataLine);
    }
    
    
}

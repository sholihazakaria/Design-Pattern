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
public class MasterCard extends Card{

    public MasterCard(String CardNumber, String CardType, int ExpYear, int ExpMonth) {
        super(CardNumber, CardType, ExpYear, ExpMonth);
        System.out.println("Card type = "+CardType+", Card Number = "+
                CardNumber+", Expiry month = "+ExpMonth+", Expiry year = "+ExpYear);
    }

    

    @Override
    public boolean lengthCheck() {
        //16
        if(CardNumber.length()==16){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean prefixCheck() {
        if(CardNumber.charAt(0) == '5'){
            if(CardNumber.charAt(1) == '1' || CardNumber.charAt(1) == '2' || CardNumber.charAt(1) == '3'
                    || CardNumber.charAt(1) == '4' || CardNumber.charAt(1) == '5'){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean isAccountInGoodStand() {
        return true;
    }
    
}

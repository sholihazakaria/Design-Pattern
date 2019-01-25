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
public class DinersClub extends Card{

    public DinersClub(String CardNumber, String CardType, int ExpYear, int ExpMonth) {
        super(CardNumber, CardType, ExpYear, ExpMonth);
        System.out.println("Card type = "+CardType+", Card Number = "+
                CardNumber+", Expiry month = "+ExpMonth+", Expiry year = "+ExpYear);
    }


    @Override
    public boolean lengthCheck() {
        //14
        if(CardNumber.length() == 14){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean prefixCheck() {
        if(CardNumber.charAt(0) == '3'){
            if(CardNumber.charAt(1) == '0'|| CardNumber.charAt(1) == '6' 
                    || CardNumber.charAt(1) == '8'){
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

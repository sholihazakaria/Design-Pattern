/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.validation;

/**
 *
 * @author Sholiha
 */
public class CAAddress {
    public boolean isValidCanadianAddr(String address,String pcode, String province){
        if(address.trim().length() < 15)
            return false;
        if(pcode.trim().length() != 6)
            return false;
        if(province.trim().length() < 6)
            return false;
        return true;
    }
}

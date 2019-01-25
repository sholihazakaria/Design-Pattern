/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.validation.object;

/**
 *
 * @author Sholiha
 */
public class USAddress extends AddressValidator{
    
    @Override
    public boolean isValidAddress(String address, String zip, String state) {
        if(address.trim().length() < 10)
            return false;
        if(zip.trim().length() < 5)
            return false;
        if(zip.trim().length() > 10)
            return false;
        if(state.trim().length() != 2 )
            return false;
        return true;
    }
}

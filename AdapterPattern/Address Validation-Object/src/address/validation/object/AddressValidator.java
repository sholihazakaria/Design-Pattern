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
public abstract class AddressValidator {
    public abstract boolean isValidAddress(String address, String zip, String state);
}

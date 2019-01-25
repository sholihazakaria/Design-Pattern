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
public class Customer {
    public static final String US = "US";
    public static final String CANADA = "Canada";
    String address,name,zip,state,type;
    
    public Customer(String name, String address, String zip, String state, String type){
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.state = state;
        this.type = type;
        //isValidAddress(address, zip, state);
    }

    public boolean isValidAddress(String address, String zip, String state) {
        AddressValidator validator = getValidator(type);
        return validator.isValidAddress(address, zip, state);
    }
    
    private AddressValidator getValidator(String custType){
        AddressValidator validator = null;
        if(custType.equals(Customer.US)){
            validator = new USAddress();
        }else if(custType.equals(CANADA)){
            validator = new CAAddressAdapter();
        }
        return validator;
    }
   
}

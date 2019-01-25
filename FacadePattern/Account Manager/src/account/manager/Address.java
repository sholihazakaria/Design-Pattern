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
public class Address {
    
    String Address;
    String City;
    String State;
    final String ADDRESS_DATA_FILE = "AddressData.txt";
    
    public Address(String add, String city, String st){
        this.Address = add;
        this.City = city;
        this.State = st;
    }
    
    public boolean isValid(){
        if(getState().trim().length() < 2)
            return false;
        return true;
    }
    
    public boolean save(){
        FileUtility futil = new FileUtility();
        String dataLine = getAddress() + "," + getCity() + "," +getState();
        return futil.WriteToFile(ADDRESS_DATA_FILE,dataLine);
    }
    
    public String getAddress(){
        return Address;
    }
    
    public String getCity(){
        return City;
    }
    
    public String getState(){
        return State;
    }
}

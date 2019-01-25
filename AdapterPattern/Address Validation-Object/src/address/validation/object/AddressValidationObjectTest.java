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
public class AddressValidationObjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer google = new Customer("Google","1600 Amphitheatre Parkway" , "94043", "CA", "US");
           System.out.println("Customer Name: "+google.name+"\n"+
                                "Address: "+google.address+"\n"+
                                "Zip/PostalCode: "+google.zip+"\n"+
                                "State/Province: "+google.state+"\n"+
                                "Address Type: "+ google.type);
           if(google.isValidAddress(google.address, google.zip, google.state)){
               System.out.println("Result: Valid customer data");
           }else{
               System.out.println("Result: Invalid customer data");
           }
           
           System.out.println("");
           
           Customer google2 = new Customer("Google2","1600 Amphitheatre Parkway" , "94043", "CA", "Canada");
           System.out.println("Customer Name: "+google2.name+"\n"+
                                "Address: "+google2.address+"\n"+
                                "Zip/PostalCode: "+google2.zip+"\n"+
                                "State/Province: "+google2.state+"\n"+
                                "Address Type: "+ google2.type);
           if(google2.isValidAddress(google2.address, google2.zip, google2.state)){
               System.out.println("Result: Valid customer data");
           }else{
               System.out.println("Result: Invalid customer data");
           }
    }
    
}

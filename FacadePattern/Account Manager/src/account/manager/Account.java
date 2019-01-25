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
public class Account {
    String firstname;
    String lastname;
    final String ACCOUNT_DATA_FILE = "AccountData.txt";
    
    public Account(String fname, String lname){
        this.firstname = fname;
        this.lastname = lname;
    }
    
    public boolean isValid(){
        if (getLastName().trim().length() < 2)
            return false;
        return true;
    }
    
    public boolean save(){
        FileUtility futil = new FileUtility();
        String dataLine = getLastName()+ "," + getFirtsName();
        return futil.WriteToFile(ACCOUNT_DATA_FILE,dataLine);
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public String getFirtsName(){
        return firstname;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.item.management.system;

import java.util.HashMap;

/**
 *
 * @author Sholiha
 */
public class Category {

    String categoryName;
    
    public Category(String categoryName){
        this.categoryName = categoryName;
    }
    
    public String getcategoryName(){
        return categoryName;
    }
}

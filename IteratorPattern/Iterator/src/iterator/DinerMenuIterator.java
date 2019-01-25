/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;
/**
 *
 * @author Sholiha
 */
public class DinerMenuIterator implements Iterator{

    MenuItem[] items;
    int position = 0; //to maintain the current position of the iteration over the array
    
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
        //take the array of menu to iterate
    }
    
    @Override
    public boolean hasNext() {
        //check if has next by checking if the position alrdy at the end of length of array
        //and if next item is null
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        //return next item in the array using position
        MenuItem menuItem = items[position];
        position = position +1;
        return menuItem;
    }
    
    @Override
    public void remove(){
        if(position <= 0){
            throw new IllegalStateException
        ("You can't remove an item until you have done at least one next()");
        }
        if(items[position-1] != null){
            for(int i = position-1; i< (items.length-1) ; i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate.manager;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Sholiha
 */
public class CertifiedCandidatesIterator implements Iterator{
    int position = 0;
    AllCandidates a;
    String type;
    
    public CertifiedCandidatesIterator(AllCandidates c,String type){
        this.a = c;
        this.type = type;
    }
    
    @Override
    public boolean hasNext(){
        if(position >= a.data.size() || a.data.get(position) == null){
            
            return false;
        }else{
            boolean temp = false;
            for(int i = position; i<a.data.size(); i++){
                if(a.data.get(i).getCert().equalsIgnoreCase(type)){
                    temp = true;
                }
            }
            return temp;
        }
    }
    
    @Override
    public Candidate next(){
        Candidate candidate = null;
        if(a.data.get(position).getCert().equalsIgnoreCase(type)){
            candidate = a.data.get(position);
            position = position +1;
        }else{
            position = position +1;
        }
        
        return candidate;
    }
    
    @Override
    public void remove(){
        if(position <= 0){
            throw new IllegalStateException
        ("You can't remove an item until you have done at least one next()");
        }
        if(a.data.get(position-1) != null){
            for(int i = position-1; i< (a.data.size()-1) ; i++){
                a.data.add(i,a.data.get(i+1));
            }
            a.data.add(a.data.size()-1,null);
        }
    }
    
    
}

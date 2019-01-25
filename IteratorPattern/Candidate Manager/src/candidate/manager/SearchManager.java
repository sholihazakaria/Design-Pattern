/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate.manager;
import java.io.FileNotFoundException;
import java.util.Iterator;
/**
 *
 * @author Sholiha
 */
public class SearchManager {
    AllCandidates all ;
    

    public SearchManager(AllCandidates all) {
        this.all = all;
    }
    
    public void printCandidate(String type){
        Iterator<Candidate> certifiedIterator = all.getCertifiedCandidatesIterator(type);
        printCandidate(certifiedIterator);
    }
    
    public void printCandidate(Iterator iterator){
        while(iterator.hasNext()){
            Candidate cert = (Candidate) iterator.next();
            if(cert != null){
                System.out.print(cert.name + ", ");
                System.out.print(cert.cert+ ", ");
                System.out.println(cert.currentWork);
            }
        }
    }
    
}

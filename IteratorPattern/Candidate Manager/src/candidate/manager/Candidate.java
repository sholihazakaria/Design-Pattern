/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate.manager;

/**
 *
 * @author Sholiha
 */
public class Candidate {
    String name, currentWork, cert;
    
    public Candidate(String name, String cert, String currentWork){
        this.name = name;
        this.currentWork = currentWork;
        this.cert = cert;
    }

    public String getName() {
        return name;
    }

    public String getCurrentWork() {
        return currentWork;
    }

    public String getCert() {
        return cert;
    }
    
    
}

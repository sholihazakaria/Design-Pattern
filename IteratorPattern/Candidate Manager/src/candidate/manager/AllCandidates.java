/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Sholiha
 */
public class AllCandidates {
    Scanner reader;
    ArrayList<Candidate> data = new ArrayList<Candidate>();
    Candidate candidate;
    
    public AllCandidates(){
        System.out.println("Printing file content:");
        try{
        reader = new Scanner(new FileInputStream("Candidates.txt"));
        while(reader.hasNextLine()){
            String candidates = reader.nextLine();
            String[] split = candidates.split(",");
            String name = split[0];
            String currentWork = split[2];
            String cert = split[1];
            candidate = new Candidate(name, cert, currentWork);
            data.add(candidate);
            System.out.println(name+","+cert+","+currentWork);
        }
        reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found Exception");
        }
        
        
    }
    
    public Iterator<Candidate> getAllCandidatesIterator(){
        return data.iterator();
    }
    
    public Iterator<Candidate> getCertifiedCandidatesIterator(String type){
        return (Iterator<Candidate>) new CertifiedCandidatesIterator(this,type);
    }
}

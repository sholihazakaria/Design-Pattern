/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate.manager;

import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Sholiha
 */
public class CandidateManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        AllCandidates candidates = new AllCandidates();
        SearchManager manager = new SearchManager(candidates);
        
        for(int i = 0; i>=0; i++){
            System.out.println("Enter 1 to display all candidates, 2 to display certified candidates, 0 to exit: ");
            String input = scanner.next();
            if(input.equals("1")){
                AllCandidates printall = new AllCandidates();
            }else if(input.equals("2")){
                System.out.println("Enter certification type: ");
                Scanner s = new Scanner(System.in);
                String type = s.nextLine();
                manager.printCandidate(type);
            }else if(input.equals("0")){
                break;
            }else{
                System.out.println("ERROR");
            }
        }
        
        
    }
    
}

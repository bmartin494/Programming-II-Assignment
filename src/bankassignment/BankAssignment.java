/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankassignment;

/**
 *
 * @author ben.martin
 */
public class BankAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CurrentAccount one = new CurrentAccount(0, 1000);
        //CurrentAccount one = new CurrentAccount(0, 1000);
        System.out.println("Initial Balance:" + one.getAccountBalance());
        
        
        Simulation sim = new Simulation(one);
        sim.StartSimulation();
    }
    
}

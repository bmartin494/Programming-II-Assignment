/**
 * This is the class called when the simulation begins. It runs on a 5 second timer, 
 * that is used to represent a month of transactions, to and from the account.
 */

package bankassignment;

import UI_Components.SimulatorJFrame;

// import list
import java.util.*;

public class Simulation 
{
    Account account = new Account();
    Transaction newTrans = new Transaction(account, 500);
    
    // constructor  
    public Simulation (Account newAccount)                       
    { 
        this.account = newAccount;
        
    }
    
    public void StartSimulation()
    {
        /** This method starts the simulation. It creates a timer that after 5 
         * second intervals, a random transaction value will be generated to 
         * represent the months dealings. 
         */
        
        // create the task to generate the transactions 
        TimerTask monthlyTransaction = new TimerTask() 
        {
            int month = 0;
            public void run()
            {
                // generate the monthly transaction
                newTrans = new Transaction(account, month);
                month++;
            }
        };
        
        // create the timer
        Timer timer = new Timer("Timer");
        
        // create 5 second delay between transactions
        long interval = 5000L;
        
        // create inital 5 second delay for first month
        long period = 5000L;
        
        // schedule the timer to fire the task every 5 seconds with no wait between firings
        timer.scheduleAtFixedRate(monthlyTransaction, period, interval);
    }   
}
package bankassignment;

/**
 * This class is called when a Savings account is
 * wanting to be created.
 * 
 * @author Rory
 */

public class SavingsAccount extends Account {
    
    // constructor
    public SavingsAccount (int accountType, int initialBalance)  
    { 
        this.accountType = accountType;
        this.accountBalance = initialBalance;
        
    }
}

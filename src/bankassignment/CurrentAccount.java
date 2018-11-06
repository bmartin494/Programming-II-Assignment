package bankassignment;

/**
 * This class is called when a Current account is
 * wanting to be created.
 * 
 * @author Rory
 */

public class CurrentAccount extends Account {
     
    // constructor  
    public CurrentAccount (int accountType, int initialBalance)                       
    { 
        this.accountBalance = initialBalance;
        this.accountType = accountType;
    }

}

package bankassignment;

/**
 * This class is called when a Current account is
 * wanting to be created.
 * 
 * @author Rory
 */

public class CurrentAccount extends Account {
     
    // constructor  
    public CurrentAccount (double initialBalance)                       
    { 
        this.accountBalance = initialBalance;
        this.accountType = 0;
    }
    
    public void setDeposit(double amountToDeposit){
        this.accountBalance = this.accountBalance + amountToDeposit;
        
        // add an extra £10 if deposit is over £500
        if (amountToDeposit >= 500)
        {
            this.accountBalance = this.accountBalance + 10;
        }
    }
    
    public void withdrawal(double amountToWithdraw) {
        this.accountBalance = this.accountBalance - amountToWithdraw;
    }

}

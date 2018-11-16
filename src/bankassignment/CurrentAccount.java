package bankassignment;

import javax.swing.JOptionPane;

/**
 * This class is called when a Current account is
 * wanting to be created.
 * 
 * @author Rory
 */

public class CurrentAccount extends Account {
     
    // constructor  
    public CurrentAccount (int accountType, double initialBalance)                       
    { 
        this.accountBalance = initialBalance;
        this.accountType = accountType;
    }
    
    public void deposit(double amountToDeposit){
        this.accountBalance = this.accountBalance + amountToDeposit;
        
        // add an extra £10 if deposit is over £500
        if (amountToDeposit >= 500)
        {
            this.accountBalance = this.accountBalance + 10;
            JOptionPane.showMessageDialog(null, "As you deposited more than £500, we're giving you an extra £10!", 
                        "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void withdrawal(double amountToWithdraw) {
        this.accountBalance = this.accountBalance - amountToWithdraw;
    }

}

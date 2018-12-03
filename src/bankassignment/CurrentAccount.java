/**
 * This class is called when a Current account is wanting to be created. 
 * It will hold the necessary account information throughout the simulation
 * and allow deposits or withdrawals to be carried out.
 * 
 * Created by: Rory Sproule
 * Last Edited: 21/11/18
 */

package bankassignment;

// Import List
import javax.swing.JOptionPane;

public class CurrentAccount extends Account {
     
    // constructor  
    public CurrentAccount (double initialBalance)                       
    { 
        this.accountBalance = initialBalance;
        this.accountType = 0;
        this.initialDeposit = initialBalance;
    }
    
    @Override
    public void setDeposit(double amountToDeposit){
        this.accountBalance = this.accountBalance + amountToDeposit;
        
        // add an extra £10 if deposit is over £500
        if (amountToDeposit >= 500)
        {
            this.accountBalance = this.accountBalance + 10;
            JOptionPane.showMessageDialog(null, "You added more than £500, here is an extra £10!", 
                "Additional Funds", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //while similar to the method above, this is still required to set the initial deposit amount that is then not overwritten
    //so that the program always knows what value to start at when creating the graph
    @Override
    public void setInitialDeposit(double amountToDeposit){
        this.initialDeposit = this.initialDeposit + amountToDeposit;
        
        if (amountToDeposit >= 500)
        {
            this.accountBalance = this.accountBalance + 10;
            JOptionPane.showMessageDialog(null, "You added more than £500, here is an extra £10!", 
                "Additional Funds", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void withdrawal(double amountToWithdraw) {
        this.accountBalance = this.accountBalance - amountToWithdraw;
    }

}

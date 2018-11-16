/**
 * The Transaction class is used to generate a monthly transaction value and 
 * whether it's a deposit or withdrawal.
 */
package bankassignment;

// import list
import java.util.Random;
import javax.swing.JOptionPane;

public class Transaction 
{
    private Account account = new Account();
    
    private int month;
    private int transType;
    private int transValue;
    
    // constructor for instantation
    public Transaction (Account transAccount, int month)                       
    { 
        this.account = transAccount;
        this.month = month;
        this.generateTransaction();
    }
    
    private void generateTransaction()
    {
        // generate a transaction type and value
        Random r = new Random();
        transType = r.nextInt((1 - 0) + 1) + 0; // transType of 0 = Withdrawal, 1 = deposit
        transValue = r.nextInt((2000 - 100) + 1) + 100; // transValue can be from 100 to 2000
        
        // ensure the transactio is valid
        if (validateTransaction() == true)
        {
            // update account with the valid transaction
            if (transType == 0)
            {
                account.withdrawal(transValue);
            }
            else if (transType == 1)
            {
                account.setDeposit(transValue);
            }
        }
        else
        {
            // add failed transaction to list with message
            
        }
        
        // reset withdrawal counter because its a new year
        if (account.getAccountType() == 1 && month % 12 == 0)
        {
            account.resetNumOfWithdrawals();
        }
    }
    
    private boolean validateTransaction()
    {
        boolean result = true;
        
        // Validating a Current Account
        if (account.getAccountType() == 0)
        {
            // ensure a withdrawal won't exceed the £1000 overdraft
            if ((transType == 0) && ((account.getAccountBalance() - transValue) < -1000))
            {
                // output error message
                JOptionPane.showMessageDialog(null, "Sorry, this transaction will be more than your overdraft!", 
                        "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                result = false;
            }
        }
        
        // Validating a Savings Account
        if (account.getAccountType() == 1)
        {
            // ensure the withdrawal is valid
            if (transType == 0)
            {
                // ensure this won't be too many withdrawals on the account
                if (account.getNumOfWithdrawals() > 1)
                {
                    // correct error message
                    JOptionPane.showMessageDialog(null, "Sorry, you've made too many withdraws this year!", 
                        "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                    result = false;
                }
                // ensure a withdrawal won't exceed the £100 minimum balance
                if ((account.getAccountBalance() - transValue) < 100)
                {
                    JOptionPane.showMessageDialog(null, "Sorry, you can't leave less than £100 in your savings account!", 
                        "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                    result = false;
                }
            }
        }
     
        return result;
    }
    
    public int getTransType()
    {
        return this.transType;
    }
    
    public int getTransValue()
    {
        return this.transValue;
    }
    
    public int getMonth()
    {
        return this.month;
    }
    

}

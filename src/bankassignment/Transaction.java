/**
 * The Transaction class is used to generate a monthly transaction value and 
 * whether it's a deposit or withdrawal.
 * 
 * It then validates this transaction against the account type current initialised
 * and either completes the deposit or withdrawal on the account or outputs an 
 * appropriate error message.
 * 
 * Created by: Rory Sproule
 * Last Edited: 21/11/18
 */
package bankassignment;

// Import List
import java.util.Random;
import javax.swing.JOptionPane;


public class Transaction 
{
    private Account acc = new Account();
    
    private int month, transType, transValue;
    private double newBalance;
    private String errorMessage = "";
    
    // constructor for instantation
    public Transaction (Account transAccount, int month)                       
    { 
        this.acc = transAccount;
        this.month = month;
    }
    
    public void generateTransaction()
    {
        // generate a transaction type and value
        Random r = new Random();
        transType = r.nextInt((1 - 0) + 1) + 0; // transType of 0 = Withdrawal, 1 = deposit
        transValue = r.nextInt((2000 - 100) + 1) + 100; // transValue can be from 100 to 2000
        
        // ensure the transaction is valid
        if (validateTransaction() == true)
        {
            // update account balance depending on transaction type
            if (transType == 0)
            {
                acc.withdrawal(transValue);
            }
            else if (transType == 1)
            {
                acc.setDeposit(transValue);
            }
        }
        
        // set new balance of the account after the transaction
        newBalance = acc.getAccountBalance();
        
        // if it's a new year for a savings account, reset num of withdraws reset withdrawal counter
        if (acc.getAccountType() == 1 && month % 12 == 0)
        {
            acc.resetNumOfWithdrawals();
        }
    }
    
    private boolean validateTransaction()
    {
        boolean result = true;
        
        // Validating a Current Account
        if (acc.getAccountType() == 0)
        {
            // ensure a withdrawal won't exceed the £1000 overdraft
            if ((transType == 0) && ((acc.getAccountBalance() - transValue) < -1000))
            {
                // output error message
                JOptionPane.showMessageDialog(null, "Sorry, this transaction will be more than your overdraft!", 
                        "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                errorMessage = ("Current Accounts can't exceed the -£1000 overdraft.");
                
                result = false;
            }
        }
        
        // Validating a Savings Account
        if (acc.getAccountType() == 1)
        {
            // ensure the withdrawal is valid
            if (transType == 0)
            {
                // ensure this won't be too many withdrawals on the account
                if (acc.getNumOfWithdrawals() > 1)
                {
                    // correct error message
                    JOptionPane.showMessageDialog(null, "Sorry, you've made too many withdraws this year!", 
                        "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                    errorMessage = ("Savings Accounts can't make more than 2 withdrawals per year.");
                    
                    result = false;
                }
                // ensure a withdrawal won't exceed the £100 minimum balance
                else if ((acc.getAccountBalance() - transValue) < 100)
                {
                    JOptionPane.showMessageDialog(null, "Sorry, you can't leave less than £100 in your savings account!", 
                        "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                    errorMessage = ("Savings Accounts can't have less than £100.");
                    
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
    
    public double getNewBalance()
    {
        return this.newBalance;
    }
    public String getErrorMessage()
    {
        return errorMessage;
    }

}

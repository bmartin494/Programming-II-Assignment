/**
 * The Transaction class is used to generate a monthly transaction value and 
 * whether it's a deposit or withdrawl.
 */
package bankassignment;

// import list
import java.util.Random;

public class Transaction 
{
    Transaction[] transactionList = new Transaction[5];
    Account account = new Account();
    int month;
    
    // constructor for instantation
    public Transaction (Account transAccount, int month)                       
    { 
        this.account = transAccount;
        this.month = month;
        this.generateTransaction();
    }
    
    // constructor for adding to transactionList
    public Transaction (int month, int transType, double transValue)
    {
        
    }
    
    public void generateTransaction()
    {
        // generate a transaction type and value
        Random r = new Random();
        int transType = r.nextInt((1 - 0) + 1) + 0; // transType of 0 = Withdrawl, 1 = deposit
        int transValue = r.nextInt((2000 - 100) + 1) + 100; // transValue can be from 100 to 2000
        
        // validate the transaction on the account
        if (validateTransaction(transType, transValue) == true)
        {
            // update account with the valid transaction
            if (transType == 0)
            {
                System.out.println("WITHDRAWL");
                account.withdrawl(transValue);
            }
            else if (transType == 1)
            {
                System.out.println("DEPOSIT");
                account.deposit(transValue);
            }
            
            // add Transaction to array
            transactionList[month] =  new Transaction(month, transType, transValue);
            
            System.out.println("Month: " + (month+1) + " \ntransType: "+ transType + 
                    " \ntransValue: " + transValue);
            
        }
        else
        {
            // add failed transaction to list with message
            
        }
        
        // reset withdrawl counter because its a new year
        if (month == 11)
        {
            account.resetNumOfWithdrawls();
        }

        System.out.println("New Balance:" +account.getAccountBalance());
    }
    
    public boolean validateTransaction(int transType, int transValue)
    {
        boolean result = true;
        
        // Validating a Current Account
        if (account.getAccountType() == 0)
        {
            // ensure a withdrawl won't exceed the £1000 overdraft
            if ((transType == 0) && ((account.getAccountBalance() - transValue) < -1000))
            {
                // correct error message
                System.out.println("Sorry, this transaction will be more than your overdraft!");
                result = false;
            }
        }
        
        // Validating a Savings Account
        if (account.getAccountType() == 1)
        {
            // ensure the withdrawl is valid
            if (transType == 0)
            {
                // ensure this won't be too many withdrawls on the account
                if (account.getNumOfWithdrawls() > 1)
                {
                    // correct error message
                    System.out.println("Sorry, too many withdrawls this year!");
                    result = false;
                }
                // ensure a withdrawl won't exceed the £100 minimum balance
                if ((account.getAccountBalance() - transValue) < 100)
                {
                    System.out.println("Sorry, you can't leave less than £100 in a savings account!");
                    result = false;
                }
            }
        }
     
        return result;
    }
}

package bankassignment;

/**
 * This is the abstract class Account, utilised when creating a new account.
 * This will hold all the necessary methods that both it's child classes 
 * (Savings & Current) will require.
 * @author B00712258
 */

public abstract class Account {
    
    int accountType;
    int accountBalance = 0;
    
    
    public void deposit(int amountToDeposit){
        
    }
    
    public void withdrawl(int amountToWithdraw) {
        
    }
    
    public int getAccountType() {
        return accountType;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
   
}


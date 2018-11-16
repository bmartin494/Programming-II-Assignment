package bankassignment;

/**
 * This is the abstract class Account, utilised when creating a new account.
 * This will hold all the necessary methods that both it's child classes 
 * (Savings & Current) will require.
 * @author B00712258
 */

public class Account {
    
    int accountType = 2;
    double accountBalance;
    
    
    public void setDeposit(double amountToDeposit){
        //default class gets overwritten in sub classes
    }
    
    public void withdrawal(double amountToWithdraw) {
        //default class gets overwritten in sub classes
    }
    
    public int getAccountType() {
        return accountType;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public int getNumOfWithdrawals() {
        return 0;
    }
    
    public void resetNumOfWithdrawals() {
        //default class gets overwritten in sub classes
    }
    
    public void addTax() {
        
        
    }
   
}


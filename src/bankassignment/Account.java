/**
 * This is the abstract class Account, utilised when creating a new account.
 * This will hold all the necessary methods that both it's child classes 
 * (Savings & Current) will require.
 * 
 * Created by: Rory Sproule
 * Last Edited: 21/11/18
 */

package bankassignment;

public class Account {
    
    int accountType = 2;
    double accountBalance;
    
    
    public void setDeposit(double amountToDeposit){
        // default class gets overwritten in sub classes
    }
    
    public void withdrawal(double amountToWithdraw) {
        // default class gets overwritten in sub classes
    }
    
    public int getAccountType() {
        return accountType;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public int getNumOfWithdrawals() {
        // default class gets overridden in Savings Class
        return 0;
    }
    
    public void resetNumOfWithdrawals() {
        // default class gets overwritten in Savings Class
    }
    
    public void addInterest() {
        // default class gets overwritten in Savings Class
    }
    
    public double getInterest()
    {
        // default class gets overwritten in Savings Class
        return 0;
    }
    public String getAccountTypeString()
    {
        // output the correct account string based on the accountType
        String type = "Not Set";
        if (accountType == 0)
        {
            type = "Current";
        }
        else if (accountType == 1)
        {
            type = "Savings";
        }
        return type;
    }
   
    
}


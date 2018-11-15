package bankassignment;

/**
 * This class is called when a Savings account is
 * wanting to be created.
 * 
 * @author Rory
 */

public class SavingsAccount extends Account {
    
   private int numOfWithdrawls = 0;
    
    // constructor
    public SavingsAccount (int accountType, double initialBalance)  
    { 
        this.accountType = accountType;
        this.accountBalance = initialBalance;
    }
    
    @Override
    public void setDeposit(double amountToDeposit){
        this.addTax();
        this.accountBalance = this.accountBalance + amountToDeposit;
    }
    
    @Override
    public void withdrawal(double amountToWithdraw) {
        this.addTax();
        this.accountBalance = this.accountBalance - amountToWithdraw;
        numOfWithdrawls++;
    }
    
    @Override
    public int getNumOfWithdrawals() {
        return numOfWithdrawls;
    }
    
    @Override
    public void resetNumOfWithdrawals() {
        numOfWithdrawls = 0;
    }
    @Override
    public void addTax() {
        // calculate the 3% interest per month and add to the account balance
        this.accountBalance = this.accountBalance + (this.accountBalance*0.03);
    }
}
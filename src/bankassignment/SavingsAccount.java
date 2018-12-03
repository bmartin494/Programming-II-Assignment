/**
 * This class is called when a Savings account is wanting to be created.
 * It will hold the necessary account information throughout the simulation
 * and allow deposits or withdrawals to be carried out.
 * It will also keep track of the withdraws made by the Savings account and 
 * calculate the tax generate each month.
 * 
 * Created by: Rory Sproule
 * Last Edited: 21/11/18
 */

package bankassignment;

public class SavingsAccount extends Account {
    
   private int numOfWithdrawls = 0;
   private double interest;
    
    // constructor
    public SavingsAccount (double initialBalance)  
    { 
        this.accountType = 1;
        this.accountBalance = initialBalance;
        this.initialDeposit = initialBalance;
    }
    
    @Override
    public void setDeposit(double amountToDeposit){
         
        /**
         * When creating this system, we were slightly unsure with the requirement ii)f) 
         * Where the interest is to be added at a particular time, we couldn't work out
         * if the system was to add interest BEFORE the monthly transaction or AFTER the 
         * transaction has been deposited/withdrawn from the account. We ended up
         * going with adding the interest BEFORE the new transaction.
         */
        
        this.interest = (this.accountBalance*0.03);
        this.addInterest();
        this.accountBalance = this.accountBalance + amountToDeposit;
    }
    
    //while similar to the method above, this is still required to set the initial deposit amount that is then not overwritten
    //so that the program always knows what value to start at when creating the graph
    @Override
    public void setInitialDeposit(double amountToDeposit){
        this.initialDeposit = this.initialDeposit + amountToDeposit;
        
    }
    
    @Override
    public void withdrawal(double amountToWithdraw) {
        

        this.interest = (this.accountBalance*0.03);
        this.addInterest();
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
    public void addInterest() {
        // calculate the 3% interest per month and add to the account balance
        this.accountBalance = this.accountBalance + this.interest;
    }
    
    @Override
    public double getInterest()
    {
        return this.interest;
    }
    
}
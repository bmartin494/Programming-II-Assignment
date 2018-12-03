/**
 * The TransactionList class is used to keep track of all monthly transactions by
 * adding them to a collection list.
 * 
 * It can then be used to output the graph showing the balance over the progressive months, 
 * and the maximum and minimum balances in the account so far in the simulation.
 * 
 * Created by: Rory Sproule
 * Last Edited: 21/11/18
 */

package bankassignment;

// Import List
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TransactionList {
    
    public List<Transaction> transList = new ArrayList<>();
    
    private double maxBalance, minBalance;
    private int maxMonth, minMonth;
    
    public TransactionList ()                       
    { 
        
    }
    
    public void addTransaction(Transaction trans)
    {

        /** 
         * As I said in our email correspondence, we have decided to add our transactions
         * sequentially to the end of the transaction list. We came to this conclusion 
         * as we believe this will enable the graph to output in the most efficient time, 
         * as we can us a for loop to work our way through the transactions. 
         * 
         * Simple comparative variables can be used to calculate the max and min balances
         * of the account as it is also an efficient method of searching, seeing as we 
         * don't need to use a loop of any kind.
         */
        
        // add transaction to the next index in the list
        transList.add((trans.getMonth() -1), trans);
    }
    
    public void compareNewBalance(double newBalance, int month)
    {
        /** if the new balance of the account is higher than any previous time,
            assign it as the maxBalance and log the month **/
        if (newBalance > maxBalance)
        {
            maxBalance = newBalance;
            maxMonth = month;
        }
        /** if the new balance of the account is lower than any previous time,
            assign it as the minBalance and log the month **/
        else if (newBalance < minBalance)
        {
            minBalance = newBalance;
            minMonth = month;
        }
    }
    
    public void setMaxBalance(double newBalance)
    {
        this.maxBalance = newBalance;
    }
    
    public void setMinBalance(double newBalance)
    {
        this.minBalance = newBalance;
    }
    
    public void getMaxAndMinBalances()
    {
        /**
         * Output the max and min values in an information box to 2 decimal places
         * If the initial balance is the max or min, the month will be output as 0,
         * as there technically hasn't been a month yet.
         * */
        
        JOptionPane.showMessageDialog(null, ("Maximum Balance: \nMonth: " + maxMonth + "\nValue: £" + String.format("%.2f", maxBalance) 
                + "\n\nMinimum Balance: \nMonth: " + minMonth + "\nValue: £" + String.format("%.2f", minBalance)), 
               "Max & Min Account Balances", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public List getList()
    {
        return transList;
    }
}

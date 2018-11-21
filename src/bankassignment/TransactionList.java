/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankassignment;


import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Rory
 */
public class TransactionList {
    
    public List<Transaction> transList = new ArrayList<>();
    
    public TransactionList ()                       
    { 
        
    }
    
    public void addTransaction(Transaction trans)
    {
        /**
         * We have decided to add Transactions to our list using an insertion sort.
         * This is due to a number of factors:
         *      - As we won't normally have too long a list, an insertion sort is ideal.
         *      - The list will nearly always be fully sorted as we are adding one transaction at a time
         *      - As our list is continually growing, the insertion sort keeps it in order constantly.
         *      - As we use a binary search to query the list, insertion sort is needed to keep it in order of balance
         */
        
        /**
        int i, slot, current,  size; 
        size = transList.size() ; 
        for(i=0 ; i < size; i++) 
        { 
            current = digits[i];
            slot = i; // Starts with 1st element 
            while((slot > 0)&&(digits[slot-1] > current())) 
            { 
                transList.get(slot) = transList.get(slot-1) ;
                slot--; 
            } 
            transList.add(slot, trans);
        }
        */
        
        /** As we only need the list to be sorted when we want to access the report or graph,
         *  We only call the insertion sort when the report or graph buttons are clicked.
         *  This maximises efficency as we are not constantly reordering the list every month.
         */
        transList.add((trans.getMonth() -1), trans);

    }
    
    public void getMaxAndMinBalances()
    {
        int i, size; 
        size = transList.size();
        double currentTrans;
        
        double maxBalance = transList.get(0).getNewBalance();
        double minBalance = transList.get(0).getNewBalance();
        
        for(i=0 ; i < size; i++) 
        { 
            currentTrans = transList.get(i).getNewBalance();
                
            if (currentTrans > maxBalance)
            {
                maxBalance = currentTrans;
            }
            else if (currentTrans < minBalance)
            {
                minBalance = currentTrans;
            }
        } 
        
        JOptionPane.showMessageDialog(null, ("Max Balance: £" + maxBalance + "\nMin Balance: £" + minBalance), 
               "Max & Min Account Balances", JOptionPane.INFORMATION_MESSAGE);
    }
}

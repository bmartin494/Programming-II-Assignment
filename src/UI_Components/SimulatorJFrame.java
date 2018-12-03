/**
 * This is the Simulator form, it is used to run the simulation of monthly transactions
 * on the account created in the Create Account form. When the simulation is started,
 * a new Transaction (used to represent a month's activity) is created, with all it's
 * details outputted to the necessary GUI components. Each transaction is also added to 
 * a collection to be analysed in the graph or report.
 * 
 * Created by: Ben Martin
 * Last Edited: 21/11/18
 */ 

package UI_Components;

// Import List
import bankassignment.Account;
import bankassignment.Transaction;
import bankassignment.TransactionList;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

public class SimulatorJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SimulatorJFrame
     */
    
    private boolean isRunning = false;
    private static int seconds = 5;
    private static int month = 0;
    
    private final static TransactionList transList = new TransactionList();
    private final Account acc = CreateAccountJFrame.newAccount;
    
    public SimulatorJFrame() {
        
        initComponents();
        
        // set countdown timer
        lblCountdown.setText(String.valueOf(seconds));
        
        // set initial account details
        displayAccountDetails();
        // we have decided to reset the month counter to zero every time the simulator is reopened. 
        month = 0;
        
        // set maximum and minimum account balances to the initial balance
        transList.setMaxBalance(acc.getAccountBalance());
        transList.setMinBalance(acc.getAccountBalance());
        
        // add initial balance to the ListBox to improve readability
        lstTransactions.add("Initial Balance: £" + acc.getAccountBalance());
        lstTransactions.add("----------------------------------------------------------------------------------------");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        lblCreateAccTitle = new javax.swing.JLabel();
        btnMaxMinBalance = new javax.swing.JButton();
        btnMonthlyBalance = new javax.swing.JButton();
        btnStartSimulation = new javax.swing.JButton();
        btnStopSimulation = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTransactionAmount = new javax.swing.JLabel();
        lblTransactionType = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAccountType = new javax.swing.JLabel();
        lblNameAccBalance = new javax.swing.JLabel();
        lblDynamicBalance = new javax.swing.JLabel();
        lblWithdrawNum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lstTransactions = new java.awt.List();
        btnBackNav = new javax.swing.JButton();
        lblTimerName = new javax.swing.JLabel();
        lblCountdown = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblCreateAccTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblCreateAccTitle.setText("Transaction Simulator");

        btnMaxMinBalance.setBackground(new java.awt.Color(153, 204, 255));
        btnMaxMinBalance.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnMaxMinBalance.setText("Max & Min Balance Report");
        btnMaxMinBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxMinBalanceActionPerformed(evt);
            }
        });

        btnMonthlyBalance.setBackground(new java.awt.Color(153, 204, 255));
        btnMonthlyBalance.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnMonthlyBalance.setText("Monthly Balance Graph");
        btnMonthlyBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlyBalanceActionPerformed(evt);
            }
        });

        btnStartSimulation.setBackground(new java.awt.Color(153, 204, 255));
        btnStartSimulation.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnStartSimulation.setText("Start Simulation");
        btnStartSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSimulationActionPerformed(evt);
            }
        });

        btnStopSimulation.setBackground(new java.awt.Color(153, 204, 255));
        btnStopSimulation.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnStopSimulation.setText("Stop Simulation");
        btnStopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSimulationActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblTransactionAmount.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTransactionAmount.setText("Transaction Value:");

        lblTransactionType.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTransactionType.setText("Transaction Type:");

        lblMonth.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblMonth.setText("Month:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Transaction Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMonth)
                    .addComponent(lblTransactionAmount)
                    .addComponent(lblTransactionType)
                    .addComponent(jLabel2))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMonth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTransactionType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTransactionAmount)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblAccountType.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblAccountType.setText("Account Type:");

        lblNameAccBalance.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblNameAccBalance.setText("Account Balance:");

        lblDynamicBalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDynamicBalance.setText("£0");

        lblWithdrawNum.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblWithdrawNum.setText("Withdrawals:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Account Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblAccountType)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameAccBalance)
                            .addComponent(lblWithdrawNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDynamicBalance)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccountType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameAccBalance)
                    .addComponent(lblDynamicBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWithdrawNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lstTransactions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstTransactions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstTransactions.setName(""); // NOI18N

        btnBackNav.setBackground(new java.awt.Color(153, 204, 255));
        btnBackNav.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBackNav.setText("Back");
        btnBackNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNavActionPerformed(evt);
            }
        });

        lblTimerName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTimerName.setText("Timer:");

        lblCountdown.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCountdown.setText("5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblTimerName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCountdown))
                                    .addComponent(lstTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBackNav))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMonthlyBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnStartSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnStopSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnMaxMinBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))))))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCreateAccTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateAccTitle)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimerName)
                    .addComponent(lblCountdown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnStartSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnStopSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaxMinBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMonthlyBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackNav))
                    .addComponent(lstTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(462, 462, 462))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNavActionPerformed
        
        // stop the simulation when returning to the control panel
        isRunning = false;
        
        new ControlPanelJFrame().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackNavActionPerformed

    private void btnStopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSimulationActionPerformed

        // set status of the simulation to false to pause it
        isRunning = false;

        JOptionPane.showMessageDialog(this, "Click Start Simulation to resume.",
            "Simulation Stopped", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnStopSimulationActionPerformed

    private void btnStartSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimulationActionPerformed

        // ensure the simulation isn't already running before commencing
        if (isRunning == false)
        {
            startSimulation();
            isRunning = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "The simulation is already running",
                "Simulation in Progress", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnStartSimulationActionPerformed

    private void btnMonthlyBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyBalanceActionPerformed
        
        // pause the simulation if it's currently running
        if (isRunning == true)
        {
            isRunning = false;
            JOptionPane.showMessageDialog(this, "The simulation has been paused to allow the monthly balance"
                    + " graph to be viewed. \nClick Start Simulation to resume.",
                "Simulation Stopped", JOptionPane.WARNING_MESSAGE);
        }

        // output the monthly balances there have been so far in the simulation
        
    }//GEN-LAST:event_btnMonthlyBalanceActionPerformed

    private void btnMaxMinBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxMinBalanceActionPerformed

        // pause the simulation if it's currently running
        if (isRunning == true)
        {
            isRunning = false;
            JOptionPane.showMessageDialog(this, "The simulation has been paused to allow the max and "
                + "min account balances report to be viewed. \nClick Start Simulation to resume.",
                "Simulation Stopped", JOptionPane.WARNING_MESSAGE);
        }

        // output the maximum and minimum values the balance have been so far in the simulation
        transList.getMaxAndMinBalances();
    }//GEN-LAST:event_btnMaxMinBalanceActionPerformed

    private void startSimulation()
    {
        /**
         * This is beginning of the methods we have created to make our own timer.
         * We understand there are timer classes available out there but we found the
         * 5 second countdown could be very easily implemented using a simple thread
         * sleep method. We have tried to fully document how it works as the methods
         * are used, but basically, we use the sleep method to decrement a seconds variable 
         * every second, and once it hits 0, the monthly processes are carried out.
         */

        // set the simulation to running
        isRunning = true;        
        
        Thread t = new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    if(isRunning == true)
                    {
                        // if the simulation is still running, restart 5 second countdown
                        beginCountdown();
                    }
                    else
                    {
                        // if the simulation is stopped, break the countdown loop
                        break;
                    }
                }
            }
        };
        
        // start the new thread
        t.start();
    }
    
    private void beginCountdown()
    {
        try
        {
            // decrement seconds variable every second.
            sleep(1000);
            seconds--;
            
            // when the 5 second countdown ends, execute the monthly transaction
            if(seconds < 0)
            {
                monthlyTransaction();
            }
                            
            // redisplay timer label every second
            lblCountdown.setText(String.valueOf(seconds));
        }
        catch(Exception e){}
    }
    
    private void monthlyTransaction()
    {
        monthlyTimeout();
       
        // create monthly transaction object and generate it's details
        Transaction newTrans = new Transaction(acc, month);
        newTrans.generateTransaction();
        
        // add transaction to TransactionList
        transList.getList().add(newTrans);
        
        // check if the new balance is now the minimum or maximum balance of the account
        transList.compareNewBalance(acc.getAccountBalance(), month);
        
        // update Simulator GUI Components
        updateGUI(newTrans);
    }
    
    private void monthlyTimeout()
    {
        // at every monthly timeout, the countdown should be reset to 5 seconds and the month counter incremented
        month++;
        seconds = 5;
        
        // output monthly timeout message
        JOptionPane.showMessageDialog(this, ("It is the end of Month: " + month), 
                "Monthly Timeout", JOptionPane.INFORMATION_MESSAGE);
    } 
    
    private void updateGUI(Transaction newTrans)
    {
        // redisplay all necessary GUI components on the form
        displayTransactionDetails(newTrans);
        displayAccountDetails();
        addTransactionToListBox(newTrans);
    }
    
    private void displayTransactionDetails(Transaction trans)
    {
        // set month label to current month
        lblMonth.setText("Month: " + month);
        
        // set the TransValue label to the value generated
        lblTransactionAmount.setText("Transaction Value: £" + trans.getTransValue());
        
        // set the TransType label to either deposit or withdrawal
        lblTransactionType.setText("Transaction Type: " + transTypeString(trans));
    }
    
    private void addTransactionToListBox(Transaction newTrans)
    {
        // output the details of the transaction to the list box in a suitable format
        lstTransactions.add("NEW TRANSACTION:");
        lstTransactions.add("Month: " + newTrans.getMonth());
        lstTransactions.add("Type: " + transTypeString(newTrans));
        lstTransactions.add("Value: £" + newTrans.getTransValue());
        
        // if its a savings account, output the interest calculated
        if (acc.getAccountType() == 1)
        {
            lstTransactions.add("Interest: £" + String.format("%.2f", acc.getInterest()));
        }
        // if a deposit value for a current account is more than £500, output the additional £10.
        else if(acc.getAccountType() == 0 && newTrans.getTransType() == 1 && newTrans.getTransValue() >= 500)
        {
            lstTransactions.add("Additional £10 for deposit over £500!");
        }
        
        lstTransactions.add("New Balance: £" + String.format("%.2f", acc.getAccountBalance()));
        
        // if the transaction ran into an error, output it
        if(!newTrans.getErrorMessage().isEmpty())
        {
            lstTransactions.add("INVALID TRANSACTION:");
            lstTransactions.add(newTrans.getErrorMessage());
        }
        
        lstTransactions.add("----------------------------------------------------------------------------------------");
    }
    
    private void displayAccountDetails()
    {
        // display the account type, initial balance and number of withdrawals
        displayBalance();
        displayAccountType();
        displayWithdraws();
    } 
    
    private void displayAccountType()
    {
        // output the correct account string based on the accountType
        if (acc.getAccountType() == 0)
        {
            lblAccountType.setText("Account Type: " + acc.getAccountTypeString());
            
            // hide withdraw number label when a current account is created as its not needed.
            lblWithdrawNum.setVisible(false);
            lblWithdrawNum.setVisible(false);
        }
        else if (acc.getAccountType() == 1)
        {
            lblAccountType.setText("Account Type: " + acc.getAccountTypeString());
            lblWithdrawNum.setText("Withdraws: " + String.valueOf(acc.getNumOfWithdrawals()));
        }
    }
    
    private void displayBalance()
    {
        lblDynamicBalance.setText("£" + String.format("%.2f", acc.getAccountBalance())); // to 2 decimal places
    }
    
    private void displayWithdraws()
    {
        lblWithdrawNum.setText("Withdrawals: " + String.valueOf(acc.getNumOfWithdrawals()));      
    }
    
    private String transTypeString(Transaction trans)
    {
        String type = "";
        
        // output the correct account string based on the accountType
        if (trans.getTransType() == 0)
        {
            type = "Withdrawal";
           
        }
        else if (trans.getTransType() == 1)
        {
            type = "Deposit";
        }
        return type;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimulatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulatorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackNav;
    private javax.swing.JButton btnMaxMinBalance;
    private javax.swing.JButton btnMonthlyBalance;
    private javax.swing.JButton btnStartSimulation;
    private javax.swing.JButton btnStopSimulation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblCountdown;
    private javax.swing.JLabel lblCreateAccTitle;
    private javax.swing.JLabel lblDynamicBalance;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblNameAccBalance;
    private javax.swing.JLabel lblTimerName;
    private javax.swing.JLabel lblTransactionAmount;
    private javax.swing.JLabel lblTransactionType;
    private javax.swing.JLabel lblWithdrawNum;
    private java.awt.List lstTransactions;
    // End of variables declaration//GEN-END:variables
}

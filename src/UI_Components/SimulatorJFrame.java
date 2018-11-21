/**
 * This is the Simulator form, it is used to run the simulation of monthly transactions
 * on the account created in the Create Account form. When the simulation is started,
 * a new Transaction (used to represent a month's activity) is created, with all it's
 * details outputted to the necessary GUI components.
 */
package UI_Components;

// import list
import bankassignment.*;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

public class SimulatorJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SimulatorJFrame
     */
    
    private static boolean simStatus = true;
    private static int seconds = 5;
    private static int month = 0;
    private static TransactionList list = new TransactionList();
    private final Account acc = CreateAccountJFrame.newAccount;
    
    public SimulatorJFrame() {
        initComponents();
        
        // set countdown timer
        lblCountdown.setText(String.valueOf(seconds));
        
        // set initial account details
        displayAccountDetails();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateAccTitle = new javax.swing.JLabel();
        lblTimerName = new javax.swing.JLabel();
        lblCountdown = new javax.swing.JLabel();
        lblNameAccBalance = new javax.swing.JLabel();
        lblDynamicBalance = new javax.swing.JLabel();
        lblTransactionAmount = new javax.swing.JLabel();
        lblAccountTypeName = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        btnStartSimulation = new javax.swing.JButton();
        btnStopSimulation = new javax.swing.JButton();
        lblTransactionType = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblWithdrawNum = new javax.swing.JLabel();
        lblWithdrawName = new javax.swing.JLabel();
        btnBackNav = new javax.swing.JButton();
        lstTransactions = new java.awt.List();
        btnMaxMinBalance = new javax.swing.JButton();
        btnMonthlyBalance = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        startSim_jMenuItem = new javax.swing.JMenuItem();
        exit_jMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCreateAccTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCreateAccTitle.setText("Transaction Simulator");

        lblTimerName.setText("Timer:");

        lblCountdown.setText("5");

        lblNameAccBalance.setText("Account Balance:");

        lblDynamicBalance.setText("£1500");

        lblTransactionAmount.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblTransactionAmount.setText("Transaction Value:");

        lblAccountTypeName.setText("Account Type:");

        lblAccountType.setText("Current");

        btnStartSimulation.setText("Start Simulation");
        btnStartSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSimulationActionPerformed(evt);
            }
        });

        btnStopSimulation.setText("Stop Simulation");
        btnStopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSimulationActionPerformed(evt);
            }
        });

        lblTransactionType.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblTransactionType.setText("Transaction Type:");

        lblMonth.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblMonth.setText("Month:");

        lblWithdrawNum.setText("0");

        lblWithdrawName.setText("Withdraws:");

        btnBackNav.setText("Back");
        btnBackNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNavActionPerformed(evt);
            }
        });

        lstTransactions.setName(""); // NOI18N

        btnMaxMinBalance.setText("Max & Min Balance Report");
        btnMaxMinBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxMinBalanceActionPerformed(evt);
            }
        });

        btnMonthlyBalance.setText("Monthly Balance Graph");
        btnMonthlyBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlyBalanceActionPerformed(evt);
            }
        });

        jMenu2.setText("File");

        startSim_jMenuItem.setText("Start Simulation");
        jMenu2.add(startSim_jMenuItem);

        exit_jMenuItem.setText("Exit");
        exit_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_jMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(exit_jMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblCreateAccTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStopSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMonthlyBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMaxMinBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAccountTypeName)
                                    .addComponent(lblTimerName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAccountType)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCountdown)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(lblWithdrawName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblWithdrawNum))))
                            .addComponent(btnStartSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTransactionType)
                            .addComponent(lblMonth)
                            .addComponent(lblTransactionAmount))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNameAccBalance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDynamicBalance))
                            .addComponent(lstTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackNav)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateAccTitle)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAccountTypeName)
                        .addComponent(lblAccountType))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNameAccBalance)
                        .addComponent(lblDynamicBalance)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lstTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStartSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaxMinBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTimerName)
                            .addComponent(lblCountdown)
                            .addComponent(lblWithdrawNum)
                            .addComponent(lblWithdrawName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMonth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTransactionType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTransactionAmount)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStopSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonthlyBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnBackNav)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jMenuItemActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exit_jMenuItemActionPerformed

    private void btnStartSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimulationActionPerformed
        
        startSimulation();
    }//GEN-LAST:event_btnStartSimulationActionPerformed

    private void startSimulation()
    {
        /**
         * This is beginning of the methods we have created to make our own timer.
         * We understand there are timer classes available out there but we found the
         * simple 5 second countdown could be very easily implemented using a simple 
         * thread sleep method. We have tried to fully document how it works as the methods
         * are used, but we basically use the sleep method to decrement a second variable 
         * every second, and once it hits 0, the monthly processes are carried out.
         */

        // set the simulation to running
        simStatus = true;
        
        Thread t = new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    if(simStatus == true)
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
        //Transaction validTrans = new Transaction(month, acc.getAccountBalance());
        list.transList.add(newTrans);
        
        // update Simulator GUI Components
        updateGUI(newTrans);
    }
    
    private void monthlyTimeout()
    {
        // at every monthly timeout, the countdown should be reset to 5 seconds and the month counter incremented
        month++;
        seconds = 5;
        
        // output monthly timeout message
        JOptionPane.showMessageDialog(null, ("It is the end of Month: " + month), 
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
        lstTransactions.add("New Balance: £" + String.format("%.2f", acc.getAccountBalance()));
        lstTransactions.add("----------------------------------------");
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
            lblAccountType.setText(acc.getAccountTypeString());
            
            // hide withdraw number label when a current account is created as its not needed.
            lblWithdrawNum.setVisible(false);
            lblWithdrawName.setVisible(false);
        }
        else if (acc.getAccountType() == 1)
        {
            lblAccountType.setText(acc.getAccountTypeString());
            lblWithdrawNum.setText(String.valueOf(acc.getNumOfWithdrawals()));
        }
    }
    
    private void displayBalance()
    {
        lblDynamicBalance.setText("£" + String.format("%.2f", acc.getAccountBalance())); // to 2 decimal places
    }
    
    private void displayWithdraws()
    {
        lblWithdrawNum.setText(String.valueOf(acc.getNumOfWithdrawals()));      
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
    
    private void btnStopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSimulationActionPerformed
        
        // set status of the simulation to false to pause it
        simStatus = false;
        JOptionPane.showMessageDialog(null, "Click start simulation to resume.", 
                "Simulation Stopped", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnStopSimulationActionPerformed

    private void btnBackNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNavActionPerformed
        
        // stop the simulation when returning to the control panel
        simStatus = false;
        new ControlPanelJFrame().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackNavActionPerformed

    private void btnMaxMinBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxMinBalanceActionPerformed

        list.getMaxAndMinBalances();
        
    }//GEN-LAST:event_btnMaxMinBalanceActionPerformed

    private void btnMonthlyBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMonthlyBalanceActionPerformed
    
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
    private javax.swing.JMenuItem exit_jMenuItem;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblAccountTypeName;
    private javax.swing.JLabel lblCountdown;
    private javax.swing.JLabel lblCreateAccTitle;
    private javax.swing.JLabel lblDynamicBalance;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblNameAccBalance;
    private javax.swing.JLabel lblTimerName;
    private javax.swing.JLabel lblTransactionAmount;
    private javax.swing.JLabel lblTransactionType;
    private javax.swing.JLabel lblWithdrawName;
    private javax.swing.JLabel lblWithdrawNum;
    private java.awt.List lstTransactions;
    private javax.swing.JMenuItem startSim_jMenuItem;
    // End of variables declaration//GEN-END:variables
}

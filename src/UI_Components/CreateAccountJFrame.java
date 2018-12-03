/**
 * This is the JFrame class for the Account Creation GUI.
 * It is the panel that users will use to create their accounts.
 *  
 * An account can either be a Current or Savings, with each having their own
 * restrictions and unique abilities.
 * 
 * This panel is used to ensure a valid account is created and passed to the simulator 
 * once approved.
 * 
 * Created by: Ben Martin
 * Last Edited: 21/11/18
 */

package UI_Components;

// Import List
import bankassignment.*;
import javax.swing.JOptionPane;

public class CreateAccountJFrame extends javax.swing.JFrame {

    public static Account newAccount = new Account();
    
    /**
     * Creates new form CreateAccountJFrame
     */
    
    public CreateAccountJFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountTypeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCreateAccTitle = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        radCurrentAccount = new javax.swing.JRadioButton();
        radSavingsAccount = new javax.swing.JRadioButton();
        txtDeposit = new javax.swing.JTextField();
        lblDeposit = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnBackNav = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblCreateAccTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblCreateAccTitle.setText("Account Creation:");

        lblAccountType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAccountType.setText("Account Type:");

        radCurrentAccount.setBackground(new java.awt.Color(255, 255, 255));
        accountTypeGroup.add(radCurrentAccount);
        radCurrentAccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radCurrentAccount.setText("Current");

        radSavingsAccount.setBackground(new java.awt.Color(255, 255, 255));
        accountTypeGroup.add(radSavingsAccount);
        radSavingsAccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radSavingsAccount.setText("Savings");

        txtDeposit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblDeposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDeposit.setText("Initial Deposit Amount:");

        btnCreateAccount.setBackground(new java.awt.Color(153, 204, 255));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnBackNav.setBackground(new java.awt.Color(153, 204, 255));
        btnBackNav.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBackNav.setText("Back");
        btnBackNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateAccTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAccountType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radCurrentAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radSavingsAccount))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDeposit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBackNav, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateAccTitle)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountType)
                    .addComponent(radCurrentAccount)
                    .addComponent(radSavingsAccount))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeposit))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBackNav, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNavActionPerformed

        new ControlPanelJFrame().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackNavActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        
        // get the string from  the deposit text field
        String depositInput = txtDeposit.getText();
        
        // various input validation checks for the deposit amount field
        try 
        {
            // convert deposit string into double
            double depositCheck = Double.parseDouble(depositInput);
            
            // ensure a positive account balance has been set
            if (depositCheck < 0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please ensure the deposit contains only numbers.",
                    "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(this, "Please ensure the depsoit is a positive number.",
                    "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
        }
        
        double deposit = Double.parseDouble(depositInput);
        
        // validate input data and create the releveant account if valid.
        if (radCurrentAccount.isSelected() && (deposit >= 1))
                {
                    newAccount = new CurrentAccount(deposit);
                    JOptionPane.showMessageDialog(this, "Account successfully created!" + "\nAccount Type: Current"
                            + "\nBalance: £" + newAccount.getAccountBalance(),
                            "Account Creation Successful!", JOptionPane.INFORMATION_MESSAGE);
                }
        else if (radSavingsAccount.isSelected() && (deposit >= 100))
        {
                newAccount = new SavingsAccount(deposit);
                // reset num of withdrawls incase 2 savings account are made after each other.
                newAccount.resetNumOfWithdrawals();
                
                    JOptionPane.showMessageDialog(this, "Account successfully created!" + "\nAccount Type: Savings"
                            + "\nBalance: £" + newAccount.getAccountBalance(),
                            "Account Creation Successful!", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (!radSavingsAccount.isSelected() && !radCurrentAccount.isSelected())
        {
            JOptionPane.showMessageDialog(this, "You must select an account type.","Invalid Account Type", JOptionPane.ERROR_MESSAGE);            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "This deposit amount does not meet the minimum for this account type.",
                    "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup accountTypeGroup;
    private javax.swing.JButton btnBackNav;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblCreateAccTitle;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JRadioButton radCurrentAccount;
    private javax.swing.JRadioButton radSavingsAccount;
    private javax.swing.JTextField txtDeposit;
    // End of variables declaration//GEN-END:variables
}

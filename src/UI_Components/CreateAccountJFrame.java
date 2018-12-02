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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemControlPanel = new javax.swing.JMenuItem();
        exit_jMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        lblCreateAccTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCreateAccTitle.setText("Create a new account");

        lblAccountType.setText("Account Type:");

        accountTypeGroup.add(radCurrentAccount);
        radCurrentAccount.setText("Current Account");

        accountTypeGroup.add(radSavingsAccount);
        radSavingsAccount.setText("Savings Account");

        lblDeposit.setText("Initial Deposit Amount:");

        btnCreateAccount.setBackground(new java.awt.Color(51, 204, 0));
        btnCreateAccount.setText("Create");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblAccountType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radCurrentAccount)
                        .addGap(18, 18, 18)
                        .addComponent(radSavingsAccount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblCreateAccTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackNav, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateAccTitle)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountType)
                    .addComponent(radCurrentAccount)
                    .addComponent(radSavingsAccount))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeposit)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBackNav, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setText("File");

        jMenuItemControlPanel.setText("Control Panel");
        jMenuItemControlPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlPanelActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemControlPanel);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jMenuItemActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exit_jMenuItemActionPerformed

    private void btnBackNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNavActionPerformed

        new ControlPanelJFrame().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackNavActionPerformed

    private void jMenuItemControlPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlPanelActionPerformed

        new ControlPanelJFrame().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItemControlPanelActionPerformed

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
            JOptionPane.showMessageDialog(null, "Please ensure the deposit contains only numbers.",
                    "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, "Please ensure the depsoit is a positive number.",
                    "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
        }
        
        double deposit = Double.parseDouble(depositInput);
        
        // validate input data and create the releveant account if valid.
        if (radCurrentAccount.isSelected() && (deposit >= 1))
                {
                    newAccount = new CurrentAccount(deposit);
                    JOptionPane.showMessageDialog(null, "Current Account successfully created!" + "\nBalance: £" + newAccount.getAccountBalance(),
                            "Account Created", JOptionPane.INFORMATION_MESSAGE);
                }
        else if (radSavingsAccount.isSelected() && (deposit >= 100))
        {
                newAccount = new SavingsAccount(deposit);
            JOptionPane.showMessageDialog(null, "Savings account successfully created!" + "\nBalance: £" + newAccount.getAccountBalance(), 
                    "Account Created", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (!radSavingsAccount.isSelected() && !radCurrentAccount.isSelected())
        {
            JOptionPane.showMessageDialog(null, "You must select an account type.","Invalid Account Type", JOptionPane.ERROR_MESSAGE);            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This deposit amount does not meet the minimum for this account type.",
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
    private javax.swing.JMenuItem exit_jMenuItem;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemControlPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblCreateAccTitle;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JRadioButton radCurrentAccount;
    private javax.swing.JRadioButton radSavingsAccount;
    private javax.swing.JTextField txtDeposit;
    // End of variables declaration//GEN-END:variables
}

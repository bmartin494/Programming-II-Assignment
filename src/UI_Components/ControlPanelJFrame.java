/**
 * This is the JFrame class for the Control Panel GUI.
 * It is the first panel that users see upon starting the application.
 * From here they can access all other forms/features of the app.
 * 
 * Create Account allows the user to do actions from 5a) to c) in the requirements.
 * Simulation allows the user to do actions from 5d) to 5f) in the requirements.
 * 
 * We use the ControlPanelJFrame as the control panel to gain access to all functionality 
 * of the system. The CreateAccountJFrame and SimulatorJFrame are both drawing panels,
 * used to provide input and request output.
 * 
 * Created by: Ben Martin
 * Last Edited: 21/11/18
 */
package UI_Components;

// Import List
import bankassignment.Account;
import javax.swing.JOptionPane;

public class ControlPanelJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ControlPanelJFrame
     */
    
    public ControlPanelJFrame() {
        initComponents();
        
        Account acc = CreateAccountJFrame.newAccount;
        
        // display the account type currently initialised
        lblDynamicAccountType.setText("Account Type: " + acc.getAccountTypeString());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnCreateAccount = new javax.swing.JButton();
        btnSimulationPanel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblDynamicAccountType = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        exit_jMenuItem = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreateAccount.setText("Create New Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnSimulationPanel.setText("Simulation");
        btnSimulationPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulationPanelActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("Control Panel");

        lblDynamicAccountType.setText("Savings/Current");

        jMenuFile.setText("File");

        exit_jMenuItem.setText("Exit");
        exit_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_jMenuItemActionPerformed(evt);
            }
        });
        jMenuFile.add(exit_jMenuItem);

        jMenuBar1.add(jMenuFile);

        jMenuHelp.setText("Help");
        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDynamicAccountType)
                    .addComponent(lblTitle))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimulationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDynamicAccountType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimulationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jMenuItemActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exit_jMenuItemActionPerformed
    
    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        
        // takes the user to the account creation panel
        new CreateAccountJFrame().setVisible(true);
        
        // hide the control panel
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    
    private void btnSimulationPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulationPanelActionPerformed
        
        // takes the user to the simulation panel
        int accCheck = CreateAccountJFrame.newAccount.getAccountType();
        
        // check to see that the user has created an account before they can access the simulation panel
        // accountType is defaulted to the value of 2, to allow the check for any account having been created.)
        if (accCheck != 2)
        {
            new SimulatorJFrame().setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        else
        {
            // output error message if an account hasn't been created yet
            JOptionPane.showMessageDialog(null, "You must first create a new account!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSimulationPanelActionPerformed

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
            java.util.logging.Logger.getLogger(ControlPanelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanelJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnSimulationPanel;
    private javax.swing.JMenuItem exit_jMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JLabel lblDynamicAccountType;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

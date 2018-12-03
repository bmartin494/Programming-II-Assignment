/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Components;

/**
 *
 * @author Ben
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        Sidemenu = new javax.swing.JLabel();
        CreateAccount = new javax.swing.JPanel();
        iconAccount = new javax.swing.JLabel();
        createaccount = new javax.swing.JLabel();
        SimulationMode = new javax.swing.JPanel();
        iconSim = new javax.swing.JLabel();
        simulation = new javax.swing.JLabel();
        ViewGraph = new javax.swing.JPanel();
        graphIcon = new javax.swing.JLabel();
        viewgraph = new javax.swing.JLabel();
        ComingSoon = new javax.swing.JPanel();
        iconSim2 = new javax.swing.JLabel();
        simulation2 = new javax.swing.JLabel();
        ComingSoon1 = new javax.swing.JPanel();
        iconSim3 = new javax.swing.JLabel();
        simulation3 = new javax.swing.JLabel();
        horizontalbar = new javax.swing.JPanel();
        WelcomePanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 255, 153));

        sidebar.setBackground(new java.awt.Color(153, 153, 255));

        Sidemenu.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Sidemenu.setText("Sidemenu");

        iconAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Components/Images/rsz_1createaccount (1).png"))); // NOI18N
        iconAccount.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        createaccount.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        createaccount.setText("Create Account");

        javax.swing.GroupLayout CreateAccountLayout = new javax.swing.GroupLayout(CreateAccount);
        CreateAccount.setLayout(CreateAccountLayout);
        CreateAccountLayout.setHorizontalGroup(
            CreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createaccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateAccountLayout.setVerticalGroup(
            CreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(createaccount))
            .addComponent(iconAccount)
        );

        iconSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Components/Images/rsz_360_video_degree_video_reality_rift_virtual_vr_motion_simulation-512.png"))); // NOI18N
        iconSim.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        simulation.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        simulation.setText("Simulation Mode");

        javax.swing.GroupLayout SimulationModeLayout = new javax.swing.GroupLayout(SimulationMode);
        SimulationMode.setLayout(SimulationModeLayout);
        SimulationModeLayout.setHorizontalGroup(
            SimulationModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulationModeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simulation))
        );
        SimulationModeLayout.setVerticalGroup(
            SimulationModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulationModeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(simulation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SimulationModeLayout.createSequentialGroup()
                .addComponent(iconSim)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        graphIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Components/Images/rsz_img_358343.png"))); // NOI18N
        graphIcon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        viewgraph.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        viewgraph.setText("View Graph");

        javax.swing.GroupLayout ViewGraphLayout = new javax.swing.GroupLayout(ViewGraph);
        ViewGraph.setLayout(ViewGraphLayout);
        ViewGraphLayout.setHorizontalGroup(
            ViewGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewGraphLayout.createSequentialGroup()
                .addComponent(graphIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewgraph)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewGraphLayout.setVerticalGroup(
            ViewGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewGraphLayout.createSequentialGroup()
                .addComponent(graphIcon)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ViewGraphLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(viewgraph)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconSim2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Components/Images/rsz_construction_icon-01-512.png"))); // NOI18N
        iconSim2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        simulation2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        simulation2.setText("Coming Soon");

        javax.swing.GroupLayout ComingSoonLayout = new javax.swing.GroupLayout(ComingSoon);
        ComingSoon.setLayout(ComingSoonLayout);
        ComingSoonLayout.setHorizontalGroup(
            ComingSoonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComingSoonLayout.createSequentialGroup()
                .addComponent(iconSim2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simulation2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ComingSoonLayout.setVerticalGroup(
            ComingSoonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComingSoonLayout.createSequentialGroup()
                .addComponent(iconSim2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ComingSoonLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(simulation2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconSim3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Components/Images/rsz_exit_1205508.png"))); // NOI18N
        iconSim3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        simulation3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        simulation3.setText("Exit");

        javax.swing.GroupLayout ComingSoon1Layout = new javax.swing.GroupLayout(ComingSoon1);
        ComingSoon1.setLayout(ComingSoon1Layout);
        ComingSoon1Layout.setHorizontalGroup(
            ComingSoon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComingSoon1Layout.createSequentialGroup()
                .addComponent(iconSim3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(simulation3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ComingSoon1Layout.setVerticalGroup(
            ComingSoon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComingSoon1Layout.createSequentialGroup()
                .addComponent(iconSim3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ComingSoon1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(simulation3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComingSoon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComingSoon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(Sidemenu)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(SimulationMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Sidemenu)
                .addGap(33, 33, 33)
                .addComponent(CreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(SimulationMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ViewGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ComingSoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ComingSoon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        horizontalbar.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout horizontalbarLayout = new javax.swing.GroupLayout(horizontalbar);
        horizontalbar.setLayout(horizontalbarLayout);
        horizontalbarLayout.setHorizontalGroup(
            horizontalbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        horizontalbarLayout.setVerticalGroup(
            horizontalbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        WelcomePanel.setBackground(new java.awt.Color(204, 255, 153));

        WelcomeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        WelcomeLabel.setText("Welcome to (InsertBankName)");

        jTextArea1.setBackground(new java.awt.Color(204, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Hello visitor, welcome to (InsertBankName) banking application please take a \nminute to explore our program along the side you will find some features that we\nhave within our bank, we will be adding more features as time progresses. \n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(WelcomeLabel)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WelcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(horizontalbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(WelcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(horizontalbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComingSoon;
    private javax.swing.JPanel ComingSoon1;
    private javax.swing.JPanel CreateAccount;
    private javax.swing.JLabel Sidemenu;
    private javax.swing.JPanel SimulationMode;
    private javax.swing.JPanel ViewGraph;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JPanel background;
    private javax.swing.JLabel createaccount;
    private javax.swing.JLabel graphIcon;
    private javax.swing.JPanel horizontalbar;
    private javax.swing.JLabel iconAccount;
    private javax.swing.JLabel iconSim;
    private javax.swing.JLabel iconSim2;
    private javax.swing.JLabel iconSim3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel simulation;
    private javax.swing.JLabel simulation2;
    private javax.swing.JLabel simulation3;
    private javax.swing.JLabel viewgraph;
    // End of variables declaration//GEN-END:variables
}
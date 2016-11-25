/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind2;


/**
 *
 * @author laurin.agostini
 */
import java.awt.event.WindowEvent;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MyJFrame
     */
    public MainWindow() {
        initComponents();
        playingField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        joinPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ipAdressTextField = new javax.swing.JTextField();
        portTextField = new javax.swing.JTextField();
        colonLabel = new javax.swing.JLabel();
        ipAdressLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        autoModeCheckbox = new javax.swing.JCheckBox();
        joinButton = new javax.swing.JButton();
        newWindowJoinCheckbox = new javax.swing.JCheckBox();
        hostPanel = new javax.swing.JPanel();
        codeLengthLabel = new javax.swing.JLabel();
        codeLengthSpinner = new javax.swing.JSpinner();
        colorCountLabel = new javax.swing.JLabel();
        colorCountSpinner = new javax.swing.JSpinner();
        codeLengthRandomCheckbox = new javax.swing.JCheckBox();
        colorCountRandomCheckbox = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tryCountLabel = new javax.swing.JLabel();
        tryCountSpiner = new javax.swing.JSpinner();
        seperator = new javax.swing.JSeparator();
        hostButton = new javax.swing.JToggleButton();
        newWindowHostCheckbox = new javax.swing.JCheckBox();
        playingField = new javax.swing.JPanel();
        sendCodeButton = new javax.swing.JButton();
        colorChooserPanel = new javax.swing.JPanel();
        colorChooserPrefab = new javax.swing.JComboBox<>();
        quitGameButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        exitMenuButton = new javax.swing.JMenu();
        helpMenuButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mastermind");

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nameTextField.setText("Client04");

        ipAdressTextField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        portTextField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        portTextField.setText("50004");

        colonLabel.setText(":");

        ipAdressLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ipAdressLabel.setText("IP-Adress");

        portLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        portLabel.setText("Port");

        autoModeCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        autoModeCheckbox.setText("Automatic Mode");

        joinButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        joinButton.setText("Join");

        newWindowJoinCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newWindowJoinCheckbox.setText("Open in new window");

        javax.swing.GroupLayout joinPanelLayout = new javax.swing.GroupLayout(joinPanel);
        joinPanel.setLayout(joinPanelLayout);
        joinPanelLayout.setHorizontalGroup(
            joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(joinPanelLayout.createSequentialGroup()
                        .addComponent(newWindowJoinCheckbox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(joinPanelLayout.createSequentialGroup()
                        .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(joinButton)
                            .addComponent(autoModeCheckbox)
                            .addComponent(nameLabel)
                            .addGroup(joinPanelLayout.createSequentialGroup()
                                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(joinPanelLayout.createSequentialGroup()
                                        .addComponent(ipAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(colonLabel))
                                    .addComponent(ipAdressLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(portLabel)
                                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nameTextField))
                        .addContainerGap(98, Short.MAX_VALUE))))
        );
        joinPanelLayout.setVerticalGroup(
            joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipAdressLabel)
                    .addComponent(portLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colonLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autoModeCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newWindowJoinCheckbox)
                .addGap(18, 18, 18)
                .addComponent(joinButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Join", joinPanel);

        codeLengthLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codeLengthLabel.setText("Code length");

        codeLengthSpinner.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        codeLengthSpinner.setModel(new javax.swing.SpinnerNumberModel(4, 2, 15, 1));
        codeLengthSpinner.setValue(4);

        colorCountLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        colorCountLabel.setText("Colors");

        colorCountSpinner.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        colorCountSpinner.setModel(new javax.swing.SpinnerNumberModel(4, 2, 15, 1));

        codeLengthRandomCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        codeLengthRandomCheckbox.setText("Random");
        codeLengthRandomCheckbox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                codeLengthRandomCheckboxStateChanged(evt);
            }
        });

        colorCountRandomCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        colorCountRandomCheckbox.setText("Random");
        colorCountRandomCheckbox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                colorCountRandomCheckboxStateChanged(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField4.setText("50004");
        jTextField4.setMinimumSize(new java.awt.Dimension(41, 22));
        jTextField4.setPreferredSize(new java.awt.Dimension(41, 22));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Port");

        tryCountLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tryCountLabel.setText("Attempts (0 = unlimited)");

        tryCountSpiner.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tryCountSpiner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        tryCountSpiner.setPreferredSize(new java.awt.Dimension(41, 22));

        hostButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hostButton.setText("Host");
        hostButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hostButtonMouseClicked(evt);
            }
        });

        newWindowHostCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newWindowHostCheckbox.setText("Open in new window");

        javax.swing.GroupLayout hostPanelLayout = new javax.swing.GroupLayout(hostPanel);
        hostPanel.setLayout(hostPanelLayout);
        hostPanelLayout.setHorizontalGroup(
            hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seperator)
            .addGroup(hostPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newWindowHostCheckbox)
                    .addComponent(hostButton)
                    .addComponent(jLabel5)
                    .addComponent(tryCountLabel)
                    .addComponent(colorCountLabel)
                    .addGroup(hostPanelLayout.createSequentialGroup()
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(colorCountSpinner)
                            .addComponent(codeLengthLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codeLengthSpinner, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorCountRandomCheckbox)
                            .addComponent(codeLengthRandomCheckbox)))
                    .addComponent(tryCountSpiner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        hostPanelLayout.setVerticalGroup(
            hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(codeLengthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeLengthRandomCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorCountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorCountRandomCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tryCountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tryCountSpiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newWindowHostCheckbox)
                .addGap(13, 13, 13)
                .addComponent(hostButton)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        colorCountSpinner.getAccessibleContext().setAccessibleName("");
        colorCountSpinner.getAccessibleContext().setAccessibleDescription("");

        tabbedPane.addTab("Host", hostPanel);

        sendCodeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendCodeButton.setText("Send");

        colorChooserPanel.setBackground(new java.awt.Color(153, 153, 153));

        colorChooserPrefab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout colorChooserPanelLayout = new javax.swing.GroupLayout(colorChooserPanel);
        colorChooserPanel.setLayout(colorChooserPanelLayout);
        colorChooserPanelLayout.setHorizontalGroup(
            colorChooserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorChooserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooserPrefab, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        colorChooserPanelLayout.setVerticalGroup(
            colorChooserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorChooserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colorChooserPrefab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        quitGameButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quitGameButton.setText("Quit Game");
        quitGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitGameButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout playingFieldLayout = new javax.swing.GroupLayout(playingField);
        playingField.setLayout(playingFieldLayout);
        playingFieldLayout.setHorizontalGroup(
            playingFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playingFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendCodeButton)
                .addContainerGap(305, Short.MAX_VALUE))
            .addGroup(playingFieldLayout.createSequentialGroup()
                .addComponent(colorChooserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(playingFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playingFieldLayout.createSequentialGroup()
                    .addContainerGap(267, Short.MAX_VALUE)
                    .addComponent(quitGameButton)
                    .addContainerGap()))
        );
        playingFieldLayout.setVerticalGroup(
            playingFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playingFieldLayout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(colorChooserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendCodeButton)
                .addContainerGap())
            .addGroup(playingFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playingFieldLayout.createSequentialGroup()
                    .addContainerGap(371, Short.MAX_VALUE)
                    .addComponent(quitGameButton)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(playingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabbedPane))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(playingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        exitMenuButton.setText("Exit");
        exitMenuButton.setToolTipText("Exit the game");
        exitMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitClicked(evt);
            }
        });
        menuBar.add(exitMenuButton);

        helpMenuButton.setText("Help");
        helpMenuButton.setToolTipText("Show a help page");
        helpMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHelpClicked(evt);
            }
        });
        menuBar.add(helpMenuButton);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); 
    }//GEN-LAST:event_jMenuExitClicked

    private void jMenuHelpClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHelpClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpWindow().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuHelpClicked

    private void codeLengthRandomCheckboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_codeLengthRandomCheckboxStateChanged
        codeLengthSpinner.setEnabled(!codeLengthRandomCheckbox.isSelected());
    }//GEN-LAST:event_codeLengthRandomCheckboxStateChanged

    private void colorCountRandomCheckboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_colorCountRandomCheckboxStateChanged
        colorCountSpinner.setEnabled(!colorCountRandomCheckbox.isSelected());
    }//GEN-LAST:event_colorCountRandomCheckboxStateChanged

    private void hostButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hostButtonMouseClicked
        activatePlayingField();
    }//GEN-LAST:event_hostButtonMouseClicked

    private void quitGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitGameButtonMouseClicked
        deactivatePlayingField();
    }//GEN-LAST:event_quitGameButtonMouseClicked
    
    private void removeColorChooserClones(){
        int count = colorChooserPanel.getComponentCount();
        for(int i = 1; i < count; ++i){
            colorChooserPanel.remove(1);
        }
    }
    private void initColorChooserPrefab(){
        colorChooserPrefab.removeAllItems();
        int colorCount = (Integer) colorCountSpinner.getValue();
        //Color[] colors={Color.white,Color.red,Color.blue,Color.green};
        //colorChooserPrefab.setModel(new DefaultComboBoxModel<Color>());
        for(int i = 0; i < colorCount; ++i){
            colorChooserPrefab.addItem("Farbe" + (i+1));
        }
        //colorChooserPrefab.setRenderer(new ComboBoxRenderer());
        colorChooserPrefab.revalidate();
    }
    
    private JComboBox getJComboBoxClone(JComboBox prefab){
        JComboBox colorChooserClone = new JComboBox(prefab.getModel());
        colorChooserClone.setLocation(prefab.getX(), prefab.getY());
        colorChooserClone.setSize(prefab.getSize());
        colorChooserClone.setEditable(prefab.isEditable());
        colorChooserClone.setRenderer(prefab.getRenderer());
        return colorChooserClone;
    }
    
    private void activatePlayingField(){
        removeColorChooserClones();
        initColorChooserPrefab();
        int codeLength = (Integer) codeLengthSpinner.getValue();
        for(int i = 0; i <  codeLength - 1; ++i){
            JComboBox colorChooserClone = getJComboBoxClone(colorChooserPrefab);
            colorChooserClone.setLocation(colorChooserClone.getLocation().x + (i+1) * colorChooserClone.getSize().width + 5, colorChooserClone.getLocation().y);
            colorChooserPanel.add(colorChooserClone);
        }
        tabbedPane.setVisible(false);
        playingField.setVisible(true);
        colorChooserPanel.revalidate();
        colorChooserPanel.repaint();
    }
    private void deactivatePlayingField(){
        playingField.setVisible(false);
        tabbedPane.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoModeCheckbox;
    private javax.swing.JLabel codeLengthLabel;
    private javax.swing.JCheckBox codeLengthRandomCheckbox;
    private javax.swing.JSpinner codeLengthSpinner;
    private javax.swing.JLabel colonLabel;
    private javax.swing.JPanel colorChooserPanel;
    private javax.swing.JComboBox<String> colorChooserPrefab;
    private javax.swing.JLabel colorCountLabel;
    private javax.swing.JCheckBox colorCountRandomCheckbox;
    private javax.swing.JSpinner colorCountSpinner;
    private javax.swing.JMenu exitMenuButton;
    private javax.swing.JMenu helpMenuButton;
    private javax.swing.JToggleButton hostButton;
    private javax.swing.JPanel hostPanel;
    private javax.swing.JLabel ipAdressLabel;
    private javax.swing.JTextField ipAdressTextField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton joinButton;
    private javax.swing.JPanel joinPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JCheckBox newWindowHostCheckbox;
    private javax.swing.JCheckBox newWindowJoinCheckbox;
    private javax.swing.JPanel playingField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField portTextField;
    private javax.swing.JButton quitGameButton;
    private javax.swing.JButton sendCodeButton;
    private javax.swing.JSeparator seperator;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel tryCountLabel;
    private javax.swing.JSpinner tryCountSpiner;
    // End of variables declaration//GEN-END:variables
}
